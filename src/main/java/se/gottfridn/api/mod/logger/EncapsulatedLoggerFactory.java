package se.gottfridn.api.mod.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *	The {@code EncapsulatedLoggerFactory} class is a factory for creating instances of {@code EncapsulatedLogger}.
 *
 * 	<p>The class provides the static method
 * 	{@link EncapsulatedLoggerFactory#getLogger}
 * 	for creating the instances of {@code EncapsulatedLogger} with specified Identifier and settings.</p>
 *
 * 	<p>The current logging framework used by this class is {@code slf4j}</p>
 *
 * <p>Usage example:
 * <blockquote><pre>
 * EncapsulatedLogger logger = EncapsulatedLoggerFactory.getLogger("myLogger", true, false);
 * logger.info("This is an info message!");
 * logger.debug("This message will only show up in debug.log!");
 * logger.warning("This is a sPOoKy warning!");
 * logger.warning("This is a warning with a throwable!", NullPointerException);
 * logger.error("This is a dangerous error!!");
 * logger.error("This is a dangerous error that throws a StackOverflowError", StackOverflowError);
 * </pre></blockquote></p>
 *
 * @see org.slf4j.Logger
 * @see org.slf4j.LoggerFactory
 * @see se.gottfridn.api.mod.logger.EncapsulatedLogger
 * @see se.gottfridn.api.mod.logger.EncapsulatedLoggerFactory#getLogger
 */
public class EncapsulatedLoggerFactory {
	/**
	 * Constructs a new {@code EncapsulatedLogger} instance with the specified options.
	 *
	 * @param name The name to be used for logging.
	 * @param outputToLog A {@code boolean} indicating whether the logger should output to the log.
	 * @param useInfoForDebug A {@code boolean} that defines whether the {@link EncapsulatedLogger#debug} method should log with {@link EncapsulatedLogger#info} method instead.
	 *
	 * @return The new {@code EncapsulatedLogger} instance.
	 *
	 * @see se.gottfridn.api.mod.logger.EncapsulatedLoggerFactory
	 */
	public static EncapsulatedLogger getLogger(String name, boolean outputToLog, boolean useInfoForDebug) {
		return new EncapsulatedLoggerImplementation(name, outputToLog, useInfoForDebug);
	}

	static final class EncapsulatedLoggerImplementation
		implements EncapsulatedLogger {
		private final boolean outputToLog;
		private final boolean useInfoForDebug;
		private final Logger logger;

		public EncapsulatedLoggerImplementation(String name, boolean outputToLog, boolean useInfoForDebug) {
			this.outputToLog = outputToLog;
			this.useInfoForDebug = useInfoForDebug;
			this.logger = LoggerFactory.getLogger(name);
		}

		/**
		 * Logs a {@code String} using the {@link Logger#info} method.
		 *
		 * @param info The {@code String} to be logged.
		 */
		@Override
		public void info(String info) {
			if (outputToLog) logger.info(info);
		}

		/**
		 * Logs a {@code String} using the {@link Logger#debug} method that will only be visible in {@code debug.log}.
		 *
		 * <p>Additionally, if the {@code this.useInfoForDebug} is true it will be logged using {@link Logger#info}</p>
		 *
		 * @param debug The {@code String} to be logged.
		 */
		@Override
		public void debug(String debug) {
			if (outputToLog) {
				if (useInfoForDebug) {
					info(debug);
				} else {
					logger.debug(debug);
				}
			}
		}

		@Override
		public void warning(String warning) {
			if (outputToLog) logger.warn(warning);
		}

		@Override
		public void warning(String warning, Throwable throwable) {
			if (outputToLog) logger.warn(warning, throwable);
		}

		@Override
		public void error(String error) {
			if (outputToLog) logger.error(error);
		}

		@Override
		public void error(String error, Throwable throwable) {
			if (outputToLog) logger.error(error, throwable);
		}
	}
}
