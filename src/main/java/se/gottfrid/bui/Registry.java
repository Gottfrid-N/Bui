package se.gottfrid.bui;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.DyeColor;
import se.gottfrid.api.registry.elements.RegistryBlock;
import se.gottfrid.api.registry.elements.RegistryItem;

public class Registry implements se.gottfrid.api.registry.Registry {
	public static final RegistryItem[] ITEMS = {
		new RegistryItem("test_item", ItemGroups.TOOLS, DEFAULT_ITEM, DEFAULT_ITEM_MODEL),
		new RegistryItem("test_2", ItemGroups.TOOLS),
	};
	public static final RegistryBlock[] BLOCKS = {
		new RegistryBlock("test_block", ItemGroups.TOOLS, MapColor.BLACK),
		new RegistryBlock("test_block_2", ItemGroups.TOOLS, DyeColor.BROWN),
		new RegistryBlock("complex_test_block", ItemGroups.TOOLS, new Block(FabricBlockSettings.of(Material.METAL)), "BlockItem", DEFAULT_BLOCK_MODEL)
	};
}
