package se.gottfridn.api.mod.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *	The {@code EncapsulatedLoggerFactory} class is a factory for {@code EncapsulatedLogger} that contains settings for logging.
 * @see se.gottfridn.api.mod.logger.EncapsulatedLogger
 * @see se.gottfridn.api.mod.logger.EncapsulatedLoggerFactory#EncapsulatedLoggerFactory(String, boolean, boolean)
 */
public class EncapsulatedLoggerFactory
		implements EncapsulatedLogger {
	private final Logger logger;
	private final boolean log;
	private final boolean debugInfo;


	/**
	 * Constructs a new {@code EncapsulatedLoggerFactory} instance with the specified options.
	 *
	 * @param id The id to be used for logging.
	 * @param log A {@code boolean} indicating whether the logger should output to the log.
	 * @param debugInfo A {@code boolean} that defines whether the {@link EncapsulatedLogger#debug} method should log with {@link EncapsulatedLogger#info} method instead.
	 *
	 * @see se.gottfridn.api.mod.logger.EncapsulatedLoggerFactory
	 */
	public EncapsulatedLoggerFactory(String id, boolean log, boolean debugInfo) {
		this.logger = LoggerFactory.getLogger(id);
		this.log = log;
		this.debugInfo = debugInfo;
	}

	@Override
	public void info(String info) {
		if (this.log) logger.info(info);
	}

	@Override
	public void debug(String debug) {
		if (this.log) {
			if (this.debugInfo) {
				info(debug);
			} else {
				logger.debug(debug);
			}
		}
	}

	@Override
	public void warning(String warning) {
		if (this.log) logger.warn(warning);
	}

	@Override
	public void warning(String warning, Throwable throwable) {
		if (this.log) logger.warn(warning, throwable);
	}

	@Override
	public void error(String error) {
		if (this.log) logger.error(error);
	}

	@Override
	public void error(String error, Throwable throwable) {
		if (this.log) logger.error(error, throwable);
	}
}
