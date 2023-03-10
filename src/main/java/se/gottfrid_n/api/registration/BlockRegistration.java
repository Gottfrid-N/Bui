package se.gottfrid_n.api.registration;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import se.gottfrid_n.api.Main;

public class BlockRegistration extends Registration<Block> {
	public BlockRegistration(Main main) {
		super(main, "block");
	}
	@Override
	public Block register(String id, Block object) {
		logRegister(id);
		return Registry.register(Registries.BLOCK, new Identifier(main.identifier, id), object);
	}
}
