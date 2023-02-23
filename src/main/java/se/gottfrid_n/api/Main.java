package se.gottfrid_n.api;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
// prefix mod id || mod name
public abstract class Main implements ModInitializer {
	public static void lowLogStage(String stage, String name, String version, Logger logger) {
		logger.info("Registering "+stage+" for "+name+" "+version);
	}
	public static void lowLogRegister(String stage, String identifier, String type, String id, Logger logger) {
		logger.info("Registering "+stage+"|"+identifier+":"+type+"/"+id);
	}
}
