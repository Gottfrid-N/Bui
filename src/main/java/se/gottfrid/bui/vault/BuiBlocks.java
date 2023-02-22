package se.gottfrid.bui.vault;


import net.minecraft.block.Block;
import se.gottfrid.api.vault.BlockRegistration;
import se.gottfrid.bui.Bui;

public class BuiBlocks extends BlockRegistration {
	public static Block registerBlock(String id, Block block) {
		return lowRegisterBlock(id, block, Bui.IDENTIFIER);
	}
}
