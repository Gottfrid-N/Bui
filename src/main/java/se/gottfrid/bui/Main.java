package se.gottfrid.bui;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.gottfrid.bui.registry.block.Blocks;
import se.gottfrid.bui.registry.item.Items;

public class Main implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("bui");
	public static final String VERSION = "indev.0.0.03_fabric.1.19.3";
	public static final String ID = "bui";
	public static final String NAME = "Bui";

	@Override
	public void onInitialize() {
		Main.LOGGER.info("Registering Blocks for "+Main.NAME +" version: "+Main.VERSION);
		Blocks.RegistryInterpreter blockInterpreter = new Blocks.RegistryInterpreter();
			blockInterpreter.interpreter();
		Main.LOGGER.info("Registering Items for "+Main.NAME+" version: "+Main.VERSION);
		Items.RegistryInterpreter itemInterpreter = new Items.RegistryInterpreter();
			itemInterpreter.interpreter();

		LOGGER.info(Main.NAME + ". By builders, for builders");
	}
}
