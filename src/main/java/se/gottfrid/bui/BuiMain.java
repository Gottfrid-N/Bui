package se.gottfrid.bui;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuiMain implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("bui");
	public static final String VERSION = "indev.0.0.01_fabric.1.19.2";
	public static final String ID = "bui";
	public static final String NAME = "Bui";

	@Override
	public void onInitialize() {

		LOGGER.info("Bui. By builders, for builders");
		LOGGER.debug(BuiMain.NAME + "version" + BuiMain.ID + BuiMain.VERSION);
		LOGGER.warn("Bui Is WIP, Errors be here!");
	}
}
