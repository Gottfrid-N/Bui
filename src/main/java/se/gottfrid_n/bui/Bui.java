package se.gottfrid_n.bui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.gottfrid_n.api.Main;

public class Bui extends Main  {
	public static final Logger LOGGER = LoggerFactory.getLogger("bui");
	private static final String FABRIC_VERSION = "fabric.1.19.3";
	private static final String VERSION_STAGE = "indev";
	private static final String VERSION_SUB_STAGES = "0.0.05";
	public static final String VERSION = VERSION_STAGE+ "-"+VERSION_SUB_STAGES+"|>"+FABRIC_VERSION;
	public static final String IDENTIFIER = "bui";
	public static final String NAME = "Bui";
	public static void logStage(String stage) {
		lowLogStage(stage, NAME, VERSION, LOGGER);
	}
	public static void logRegister(String id, String type, String stage) {lowLogRegister(stage, IDENTIFIER, type, id, LOGGER);}
	@Override
	public void onInitialize() {
		logStage("Items");

		logStage("Blocks");

		LOGGER.info(Bui.NAME + ". By builders, for builders");
	}
}
