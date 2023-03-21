package se.gottfridn.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.gottfridn.api.objects.Version;

@SuppressWarnings("unused")
public class Values {
	public final String name;		public final String identifier;
	public final Version version;
	public final boolean log;	public final boolean debugInfo;	private final Logger logger;

	public Values(String name, boolean log, boolean debugInfo, Version version) {
		this.identifier = name.toLowerCase();
		this.name = name;
		this.log = log;
		this.debugInfo = debugInfo;
		this.version = version;
		this.logger = LoggerFactory.getLogger(this.name);
		if(!this.version.stable()) {
			logWarn(name+" "+version+" is unstable!");
		}
	}
	public void logInfo(String string) {
		if(this.log) {
			logger.info(string);
		}
	}
	public void logDebug(String string) {
		if(this.log) {
			if(!this.debugInfo) {
				logDebug(string);
				return;
			}
			logInfo(string);
		}
	}
	public void logWarn(String string) {
		if(this.log) {
			logger.warn(string);
		}
	}
	public void logError(String string) {
		if(this.log) {
			logger.error(string);
		}
	}
}
