package se.gottfrid_n.bui.vault;


import net.minecraft.block.Block;
import se.gottfrid_n.api.vault.BlockRegistration;
import se.gottfrid_n.bui.Bui;

public class BuiBlocks extends BlockRegistration {
	public static Block registerBlock(String id, Block block) {
		return lowRegisterBlock(id, block, Bui.IDENTIFIER);
	}
}
