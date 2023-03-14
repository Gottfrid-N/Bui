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
import se.gottfrid_n.api.Mod;
import se.gottfrid_n.api.objects.Version;
import se.gottfrid_n.api.vault.objects.VaultBlock;
import se.gottfrid_n.api.vault.objects.VaultItem;

public class Bui implements ModInitializer {
	public static final Mod BUI = new Mod(new Main(
			"Bui",
			true, true,
			new Version("bui",true,
					"api-indev","0.0a.0b",
					"fabric-0.73.2","1.19.3")));
	@Override
	public void onInitialize() {
		BUI.vault.add(new VaultBlock("vault_block",
				new Block(FabricBlockSettings.of(Material.METAL)),
				new BlockItem(BUI.vault.blocks.get("vault_block"),new FabricItemSettings()),
				ItemGroups.TOOLS));
		BUI.vault.add(new VaultBlock("vault_only_block",
				new Block(FabricBlockSettings.of(Material.METAL)), null, null));
		BUI.vault.add(new VaultItem("vault_item",
				new Item(new FabricItemSettings()),
				ItemGroups.TOOLS));
		BUI.vault.interpret();
		BUI.main.logDebug(BUI.main.version.toString());
	}
}