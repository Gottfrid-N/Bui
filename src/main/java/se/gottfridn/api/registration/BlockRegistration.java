package se.gottfridn.api.registration;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import se.gottfridn.api.objects.logger.EncapsulatedLogger;

public class BlockRegistration
	extends Registration<Block> {

	public BlockRegistration(String identifier, EncapsulatedLogger logger) {
		super(identifier, logger);
	}

	@Override
	public Block register(String id, Block object) {
		logRegister(id, object);
		return Registry.register(Registries.BLOCK, new Identifier(this.identifier, id), object);
	}

	@Override
	public void logRegister(String id, Block object) {
		logRegister(id, "block");
		logRegisterDebug(id, object);
	}

	@Override
	protected void logRegisterDebug(String id, Block object) {
		logger.debug("Binding block id: " + id + " to " + object);
	}

}
