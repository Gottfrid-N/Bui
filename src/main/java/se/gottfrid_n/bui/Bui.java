package se.gottfrid_n.bui;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import se.gottfrid_n.api.Main;
import se.gottfrid_n.api.Version;
import se.gottfrid_n.api.registration.BlockRegistration;
import se.gottfrid_n.api.registration.ItemRegistration;

public class Bui implements ModInitializer {
	public static final Main MAIN = new Main("bui","Bui", true,
			new Version("bui","stable","indev2","0.0a.1c","fabric-0.73.2","1.19.3"));
	public static final String ITEM_STAGE = "item";
	public static final String BLOCK_ITEM_STAGE = "";
	public static final String BLOCK_STAGE = "block";
	public static final ItemRegistration ITEM = new ItemRegistration(MAIN);
	public static final BlockRegistration BLOCK = new BlockRegistration(MAIN);
	public static final Block TEST_BLOCK = BLOCK.register("test_block", new Block(FabricBlockSettings.of(Material.METAL)), BLOCK_STAGE);
	public static final Item TEST_BLOCK_ITEM = ITEM.register("test_block", new BlockItem(TEST_BLOCK, new FabricItemSettings())
			, BLOCK_ITEM_STAGE);
	public static final Block DEFUALT_TEST_BLOCK = BLOCK.register("default_test_block", BLOCK_STAGE);

	public static final Item TEST_ITEM = ITEM.register("test_item", new Item(new FabricItemSettings()), ITEM_STAGE);
	public static final Item DEFUALT_TEST_ITEM = ITEM.register("default_test_item",ITEM_STAGE);

	@Override
	public void onInitialize() {
		MAIN.logStage("toItemGroup");
		ITEM.toItemGroup(TEST_ITEM, ItemGroups.TOOLS);
		ITEM.toItemGroup(DEFUALT_TEST_ITEM, ItemGroups.TOOLS);
		ITEM.toItemGroup(TEST_BLOCK_ITEM, ItemGroups.TOOLS);
		MAIN.logger.info(MAIN.name + ". By builders, for builders");
		MAIN.logger.info(MAIN.version);
	}
}
