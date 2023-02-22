package se.gottfrid_n.api.vault;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
// prefix mod id
public abstract class Vault {
	public static Item defaultItem(FabricItemSettings settings) {//complex
		return new Item(settings);
	}
	public static Item defaultItem() {
		return defaultItem(new FabricItemSettings());
	}
	public static Block defaultBlock(Material material, MapColor color ) {//complex
		return new Block(FabricBlockSettings.of(material, color));
	}
	public static Block defaultBlock(MapColor color) {
		return defaultBlock(Material.METAL, color);
	}
}
