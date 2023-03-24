package se.gottfridn.api.mod.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EncapsulatedLoggerFactory
	implements EncapsulatedLogger {
	private final Logger logger;
	private final boolean log;
	private final boolean debugInfo;

	public EncapsulatedLoggerFactory(String identifier, boolean log, boolean debugInfo) {
		this.logger = LoggerFactory.getLogger(identifier);
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
			if(this.debugInfo) {
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
