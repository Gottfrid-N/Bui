package se.gottfrid.bui.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.DyeColor;

public class RegistryBlock extends RegistryElement {
	public Block BLOCK;
	public String BLOCK_ITEM;

	private static Block defaultBlock(DyeColor color) {
		return new Block(FabricBlockSettings.of(Material.METAL).mapColor(color));
	}
	private static Block defaultBlock(MapColor color) {
		return new Block(FabricBlockSettings.of(Material.METAL).mapColor(color));
	}

	public RegistryBlock(String id, ItemGroup itemGroup, Block block, String blockItem, Model model) {
		super(id, itemGroup, model);
		BLOCK = block;
		BLOCK_ITEM = blockItem;
	}
	public RegistryBlock(String id, ItemGroup itemGroup, MapColor color) {
		super(id, itemGroup, Models.CUBE_ALL);
		BLOCK = defaultBlock(color);
		BLOCK_ITEM = "BlockItem";
	}
	public RegistryBlock(String id, ItemGroup itemGroup, DyeColor color) {
		super(id, itemGroup, Models.CUBE_ALL);
		BLOCK = defaultBlock(color);
		BLOCK_ITEM = "BlockItem";
	}
}
