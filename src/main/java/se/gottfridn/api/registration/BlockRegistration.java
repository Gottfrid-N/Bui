package se.gottfridn.api.registration;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import se.gottfridn.api.Values;

public class BlockRegistration extends RegistrationImpl<Block> {
	public BlockRegistration(Values values) {
		super(values, "block", Registries.BLOCK);
	}
}
