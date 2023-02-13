package se.gottfrid.bui.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.MapColor;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.DyeColor;
import se.gottfrid.bui.registry.block.RegistryBlock;
import se.gottfrid.bui.registry.item.RegistryItem;

public class Registry {
	public static final RegistryItem[] ITEMS = {
		new RegistryItem("test_item", ItemGroups.TOOLS, new Item(new FabricItemSettings()), Models.GENERATED),
		new RegistryItem("test_2", ItemGroups.TOOLS),
	};
	public static final RegistryBlock[] BLOCKS = {
		new RegistryBlock("test_block", ItemGroups.TOOLS, MapColor.BLACK),
		new RegistryBlock("test_block_2", ItemGroups.TOOLS, DyeColor.BROWN)
	};
	public interface Interpreter {
		void interpreter();
	}
}
