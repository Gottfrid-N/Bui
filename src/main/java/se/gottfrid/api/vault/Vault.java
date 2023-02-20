package se.gottfrid.api.vault;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.Item;

// ALWAYS PREFIX WITH IDENTIFIER OF MOD
public abstract class Vault {
	public static Item defualtItem() {
		return new Item(new FabricItemSettings());
	}
	public static Block defualtBlock(Material material, MapColor color ) {
		return new Block(FabricBlockSettings.of(material, color));
	}
	public static Block defualtBlock(MapColor color) {
		return new Block(FabricBlockSettings.of(Material.METAL, color));
	}
}
