package se.gottfrid_n.bui;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import se.gottfrid_n.api.Mod;
import se.gottfrid_n.api.objects.Version;
import se.gottfrid_n.api.vault.objects.VaultBlock;
import se.gottfrid_n.api.vault.objects.VaultItem;

public class Bui implements ModInitializer {
	public static final Mod BUI = new Mod("Bui", true, true,
			new Version("bui",true,
					"api-indev","0.0a.0b",
					"fabric-0.73.2","1.19.3"));
	public static final Block TEST_BLOCK = BUI.block.register("test_block", new Block(FabricBlockSettings.of(Material.METAL)));
	public static final Item TEST_BLOCK_ITEM = BUI.item.register("test_block", new BlockItem(TEST_BLOCK, new FabricItemSettings()));

	public static final Item TEST_ITEM = BUI.item.register("test_item", new Item(new FabricItemSettings()));

	@Override
	public void onInitialize() {
		BUI.vault.toVault(new VaultBlock("vault_block",
				new Block(FabricBlockSettings.of(Material.METAL)),
				new BlockItem(BUI.vault.blocks.get("vault_block"),new FabricItemSettings()),
				ItemGroups.TOOLS));
		BUI.vault.toVault(new VaultItem("vault_item",
				new Item(new FabricItemSettings()),
				ItemGroups.TOOLS));

		BUI.item.toItemGroup(TEST_ITEM, ItemGroups.TOOLS);
		BUI.item.toItemGroup(TEST_BLOCK_ITEM, ItemGroups.TOOLS);
		BUI.main.logInfo(BUI.main.name + ". By builders, for builders");
		BUI.main.logDebug(BUI.main.version);
		BUI.main.logWarn("Bui is in indev");
	}
}
