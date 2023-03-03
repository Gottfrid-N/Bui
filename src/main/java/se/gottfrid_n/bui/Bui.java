package se.gottfrid_n.bui;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import se.gottfrid_n.api.ItemRegistration;
import se.gottfrid_n.api.Main;
import se.gottfrid_n.api.Version;

public class Bui implements ModInitializer {
	public static final Main MAIN = new Main("bui","Bui", true,
			new Version("bui","indev2","stable","0.0a.1b","fabric.1.19.3"));
	public static final ItemRegistration ITEM = new ItemRegistration(MAIN);
	public static final Item TEST_ITEM = ITEM.register("test", new Item(new FabricItemSettings()), "main");
	public static final Item DEFUALT_TEST_ITEM = ITEM.register("default_test", "main");

	@Override
	public void onInitialize() {
		MAIN.logStage("toItemGroup");
		ITEM.toItemGroup(TEST_ITEM, ItemGroups.TOOLS);
		ITEM.toItemGroup(DEFUALT_TEST_ITEM, ItemGroups.TOOLS);
		MAIN.logger.info(MAIN.name + ". By builders, for builders");
		MAIN.logger.info(MAIN.version);
	}
}
