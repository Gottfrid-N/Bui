package se.gottfrid_n.api.registration;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import se.gottfrid_n.api.Main;

public class BlockRegistration extends Registration<Block> {
	public BlockRegistration(Main main) {
		super(main, "block", Registries.BLOCK);
	}
}
