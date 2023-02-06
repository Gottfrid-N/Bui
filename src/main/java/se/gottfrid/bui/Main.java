package se.gottfrid.bui;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.gottfrid.bui.block.Blocks;
import se.gottfrid.bui.item.Items;

public class Main implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("bui");
	public static final String VERSION = "indev.0.0.01_fabric.1.19.3";
	public static final String ID = "bui";
	public static String NAME = "Bui";

	@Override
	public void onInitialize() {

		Items.registerBuiItems();
		Blocks.registerBuiBlocks();


		LOGGER.info("Bui. By builders, for builders");
		LOGGER.debug(Main.NAME + " version " + Main.ID + Main.VERSION);
		LOGGER.warn("Bui Is WIP, Errors be here!");
	}
}
