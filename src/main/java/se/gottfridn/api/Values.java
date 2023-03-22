package se.gottfridn.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.gottfridn.api.objects.version.Version;

@SuppressWarnings("unused")
public class Values {
	public final String name;
	public final String identifier;
	public final Version version;

	public final boolean log;
	public final boolean debugInfo;

	private final Logger logger;

	public Values(String name, Version version, boolean log, boolean debugInfo) {
		this.name = name;
		this.identifier = this.name.toLowerCase();
		this.version = version;

		this.log = log;
		this.debugInfo = debugInfo;

		this.logger = LoggerFactory.getLogger(this.name);
	}
	public void logInfo(String info) {
		if(this.log) {
			logger.info(info);
		}
	}
	public void logDebug(String debug) {
		if(this.log) {
			if(this.debugInfo) {
				logInfo(debug);
			} else {
				logDebug(debug);
			}
		}
	}
	public void logWarning(String warning) {
		if(this.log) {
			logger.warn(warning);
		}
	}
	public void logError(String error) {
		if(this.log) {
			logger.error(error);
		}
	}
}