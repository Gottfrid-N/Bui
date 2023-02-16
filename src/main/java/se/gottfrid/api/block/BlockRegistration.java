package se.gottfrid.api.block;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class BlockRegistration {
	public static Block registerBlock(String id, Block block, String identifier) {
		return net.minecraft.registry.Registry.register(Registries.BLOCK, new Identifier(identifier, id), block);
	}
}
