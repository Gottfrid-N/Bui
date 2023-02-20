package se.gottfrid.api;

import org.slf4j.Logger;

public abstract class Main {
	public static void logStage(String stage, String name, String version, Logger logger) {
		logger.info("Registering "+stage+" for "+name+" version: "+ version);
	}
	public static void logRegister(String stage, String identifier, String type, String id, Logger logger) {
		logger.info("Registering "+stage+"|"+identifier+":"+type+"/"+id);
	}
}
