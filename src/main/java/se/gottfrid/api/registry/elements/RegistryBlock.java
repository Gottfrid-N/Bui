package se.gottfrid.api.registry.elements;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.DyeColor;
import se.gottfrid.api.block.BlockRegistration;

public class RegistryBlock extends RegistryElement {
	public final Block block;
	public final String blockItem;

	private static Block defaultBlock(DyeColor color) {
		return new Block(FabricBlockSettings.of(Material.METAL).mapColor(color));
	}
	private static Block defaultBlock(MapColor color) {
		return new Block(FabricBlockSettings.of(Material.METAL).mapColor(color));
	}

	public RegistryBlock(String id, ItemGroup itemGroup, Block block, String blockItem, Model model) {
		super(id, itemGroup, model);
		this.block = block;
		this.blockItem = blockItem;
	}
	public RegistryBlock(String id, ItemGroup itemGroup, MapColor color) {
		super(id, itemGroup, Models.CUBE_ALL);
		block = defaultBlock(color);
		blockItem = "BlockItem";
	}
	public RegistryBlock(String id, ItemGroup itemGroup, DyeColor color) {
		super(id, itemGroup, Models.CUBE_ALL);
		block = defaultBlock(color);
		blockItem = "BlockItem";
	}
	public Block interpret(String identifier) {
		return BlockRegistration.registerBlock(this.id, this.block, identifier);
	}
}
