package se.gottfridn.bui;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import se.gottfridn.api.Values;
import se.gottfridn.api.Mod;
import se.gottfridn.api.objects.Version;
import se.gottfridn.api.vault.objects.VaultBlock;
import se.gottfridn.api.vault.objects.VaultItem;

public class Bui implements ModInitializer {
	public static final Mod BUI = new Mod(new Values("Bui", true, true,
			new Version("bui", false,
					"indev", (byte) 0, (byte) 0, (byte) 1 , 'a',
					"1.19.4",
					"0.76.0+1.19.4", "0.14.17", "1.19.4+build.1"
					)));
	@Override
	public void onInitialize() {

		BUI.logDebug(BUI.values.version.getVerbose());
	}
}