package se.gottfrid.bui;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.gottfrid.bui.block.Blocks;
import se.gottfrid.bui.item.Items;

public class Main implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("bui");
	public static final String VERSION = "indev.0.0.04_fabric.1.19.3";
	public static final String ID = "bui";
	public static final String NAME = "Bui";
	public static void logRegister(String id, String stage) {
		LOGGER.info("Registering "+Main.ID+":"+stage+"/"+id);
	}
	private static void registerStage(String stage) {
		Main.LOGGER.info("Registering "+stage+" for "+Main.NAME +" version: "+Main.VERSION);
	}

	@Override
	public void onInitialize() {
		registerStage("Items");
		Blocks.RegistryInterpreter.interpreter();
		registerStage("Blocks");
		Items items = new Items();
		items.interpreter();
		LOGGER.info(Main.NAME + ". By builders, for builders");
	}
}
