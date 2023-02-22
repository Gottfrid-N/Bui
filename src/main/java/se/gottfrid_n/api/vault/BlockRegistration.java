package se.gottfrid_n.api.vault;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public abstract class BlockRegistration {
	public static Block lowRegisterBlock(String id, Block block, String identifier) {
		return net.minecraft.registry.Registry.register(Registries.BLOCK, new Identifier(identifier, id), block);
	}
}
