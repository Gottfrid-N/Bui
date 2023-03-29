package se.gottfridn.library.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *	The {@code EncapsulatedLoggerFactory} class is a factory for creating instances of {@code EncapsulatedLogger}.
 *
 * 	<p>The class provides the static method
 * 	{@link EncapsulatedLoggerFactory#getLogger}
 * 	for creating the instances of {@code EncapsulatedLogger} with specified Identifier and settings.</p>
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
 * @apiNote The implementation for this is {@link EncapsulatedLoggerImplementation}
 *
 * @see org.slf4j.Logger
 * @see org.slf4j.LoggerFactory
 * @see se.gottfridn.library.logger.EncapsulatedLogger
 * @see se.gottfridn.library.logger.EncapsulatedLoggerFactory#getLogger
 * @see EncapsulatedLoggerImplementation
 */
public class EncapsulatedLoggerFactory {
	/**
	 * Constructs a new {@code EncapsulatedLogger} instance with the specified options.
	 *
	 * @param name The name to be used for logging.
	 * @param outputToLog A {@code boolean} indicating whether the logger should output to the log.
	 * @param useInfoForDebug A {@code boolean} that defines whether the {@link EncapsulatedLogger#debug} method should log with {@link EncapsulatedLogger#info} method instead.
	 *
	 * @return The constructed {@code EncapsulatedLogger} instance.
	 *
	 * @see se.gottfridn.library.logger.EncapsulatedLoggerFactory
	 * @see EncapsulatedLoggerImplementation
	 */
	public static EncapsulatedLogger getLogger(String name, boolean outputToLog, boolean useInfoForDebug) {
		return new EncapsulatedLoggerImplementation(name, outputToLog, useInfoForDebug);
	}

	/**
	 * The {@code EncapsulatedLoggerImplementation} class is an implementation of the interface {@link EncapsulatedLogger}.
	 * <p>
	 * This class provides options to disable logging and use {@link Logger#info} instead of {@link Logger#debug}.
	 * This is done because in a development environment you cant see what {@link Logger#debug} outputs.
	 * </p>
	 *
	 * @apiNote This implementation uses the {@link Logger} api
	 * @see EncapsulatedLogger
	 * @see EncapsulatedLoggerFactory
	 * @see EncapsulatedLoggerFactory#getLogger(String, boolean, boolean)
	 * @see EncapsulatedLoggerImplementation#EncapsulatedLoggerImplementation(String, boolean, boolean)  EncapsulatedLoggerImplementation
	 */

	@SuppressWarnings("unused")
	static final class EncapsulatedLoggerImplementation
			implements EncapsulatedLogger {
		private final Logger logger;
		private final boolean outputToLog;
		private final boolean useInfoForDebug;

		/**
		 * Constructs a {@link EncapsulatedLoggerImplementation} instance with the given {@code name}, {@code outPutToLog} and {@code useInfoForDebug}.
		 *
		 * @param name            The {@code name} of the {@link Logger}
		 * @param outputToLog     Controls if the {@link EncapsulatedLogger} should output to the log or not.
		 * @param useInfoForDebug Controls if the {@link EncapsulatedLoggerImplementation#debug(String)} method should use {@link Logger#info} instead of {@link Logger#debug}
		 * @see EncapsulatedLoggerImplementation
		 * @see EncapsulatedLoggerFactory
		 */
		public EncapsulatedLoggerImplementation(String name, boolean outputToLog, boolean useInfoForDebug) {
			this.logger = LoggerFactory.getLogger(name);
			this.outputToLog = outputToLog;
			this.useInfoForDebug = useInfoForDebug;
		}

		/**
		 * Logs the given {@code String} using the {@link Logger#info} method, but only if {@code outputToLog} is true.
		 *
		 * @param info The {@code String} to be logged.
		 */
		@Override
		public void info(String info) {
			if (outputToLog) logger.info(info);
		}

		/**
		 * Logs the given {@code String} using the {@link Logger#debug} method,
		 * but only if {@code outputToLog} is true.
		 * <p>
		 * If {@code useInfoForDebug} is true,
		 * it will use the {@link Logger#info} method instead of the {@link Logger#debug} method.
		 * </p>
		 *
		 * @param debug The {@code String} to be logged.
		 */
		@Override
		public void debug(String debug) {
			if (useInfoForDebug) {
				info(debug);
			} else {
				alwaysLogDebug(debug);
			}
		}

		private void alwaysLogDebug(String debug) {
			if (outputToLog) logger.debug(debug);
		}

		/**
		 * Logs the given {@code String} using the {@link Logger#warn} method,
		 * but only if {@code outputToLog} is true.
		 *
		 * @param warning The {@code String} to be logged.
		 * @see EncapsulatedLoggerImplementation#warning(String, Throwable)
		 */
		@Override
		public void warning(String warning) {
			if (outputToLog) logger.warn(warning);
		}

		/**
		 * Logs the given {@code String} and {@code Throwable} using the {@link Logger#warn} method,
		 * but only if {@code outputToLog} is true.
		 *
		 * @param warning   The {@code String} to be logged.
		 * @param throwable The {@code Throwable} to be thrown, note that this throwable doesn't cause an exception.
		 * @see EncapsulatedLoggerImplementation#warning(String)
		 */
		@Override
		public void warning(String warning, Throwable throwable) {
			if (outputToLog) logger.warn(warning, throwable);
		}

		/**
		 * Logs the given {@code String} using the {@link Logger#error} method,
		 * but only if {@code outputToLog} is true.
		 *
		 * @param error The {@code String} to be logged.
		 * @see EncapsulatedLoggerImplementation#error(String, Throwable)
		 */
		@Override
		public void error(String error) {
			if (outputToLog) logger.error(error);
		}

		/**
		 * Logs the given {@code String} and {@code Throwable} using the {@link Logger#error} method,
		 * but only if {@code outputToLog} is true.
		 *
		 * @param error     The {@code String} to be logged.
		 * @param throwable The {@code Throwable} to be thrown, note that this throwable doesn't cause an exception.
		 * @see EncapsulatedLoggerImplementation#error(String)
		 */
		@Override
		public void error(String error, Throwable throwable) {
			if (outputToLog) logger.error(error, throwable);
		}
	}
}