package se.gottfridn.library.logger.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.gottfridn.library.logger.EncapsulatedLogger;

/**
 *	This class is a factory for creating instances of {@link EncapsulatedLogger}.
 *	<p>
 *	   This class provides the static method
 *	   {@link EncapsulatedLoggerFactory#getLogger}
 *	   for creating the instances of {@link EncapsulatedLogger} with specified Identifier and settings.
 * 	</p><p>Usage example:
 * <blockquote><pre>
 * EncapsulatedLogger logger() = EncapsulatedLoggerFactory.getLogger("myLogger", true, false);
 * logger().info("This is an info message!");
 * logger().debug("This message will only show up in debug.log!");
 * logger().warning("This is a sPOoKy warning!");
 * logger().warning("This is a warning with a throwable!", NullPointerException);
 * logger().error("This is a dangerous error!!");
 * logger().error("This is a dangerous error that throws a StackOverflowError", StackOverflowError);
 * </pre></blockquote></p>
 *
 * @see org.slf4j.Logger
 * @see org.slf4j.LoggerFactory
 * @see se.gottfridn.library.logger.EncapsulatedLogger
 * @see EncapsulatedLoggerFactory#getLogger
 * @see EncapsulatedLoggerImplementation
 */
public class EncapsulatedLoggerFactory {
	/**
	 * Constructs a new {@link EncapsulatedLogger} instance with the specified options.
	 *
	 * @param name The {@code name} to be used for logging.
	 * @param outputToLog A {@link Boolean} indicating whether the logger() should output to the log.
	 * @param useInfoForDebug A {@link Boolean} that defines whether the {@link EncapsulatedLogger#debug} method should log with {@link EncapsulatedLogger#info} method instead.
	 *
	 * @return The constructed {@link EncapsulatedLogger} instance.
	 *
	 * @see EncapsulatedLoggerFactory
	 * @see EncapsulatedLoggerImplementation
	 */
	public static EncapsulatedLogger getLogger(String name, boolean outputToLog, boolean useInfoForDebug) {
		return new EncapsulatedLoggerImplementation(LoggerFactory.getLogger(name), outputToLog, useInfoForDebug);
	}


	private record EncapsulatedLoggerImplementation(Logger logger, boolean outputToLog, boolean useInfoForDebug)
			implements EncapsulatedLogger {
		@Override
		public void info(String info) {
			if (outputToLog()) logger().info(info);
		}

		@Override
		public void debug(String debug) {
			if (useInfoForDebug()) {
				info(debug);
			} else {
				alwaysLogDebug(debug);
			}
		}

		private void alwaysLogDebug(String debug) {
			if (outputToLog()) logger().debug(debug);
		}

		@Override
		public void warning(String warning) {
			if (outputToLog()) logger().warn(warning);
		}

		@Override
		public void warning(String warning, Throwable throwable) {
			if (outputToLog()) logger().warn(warning, throwable);
		}

		@Override
		public void error(String error) {
			if (outputToLog()) logger().error(error);
		}

		@Override
		public void error(String error, Throwable throwable) {
			if (outputToLog()) logger().error(error, throwable);
		}
	}
}