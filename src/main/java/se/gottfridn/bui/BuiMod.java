package se.gottfridn.bui;

import net.fabricmc.api.ModInitializer;
import se.gottfridn.api.mod.identifier.ModIdentifierFactory;
import se.gottfridn.api.mod.identifier.ModIdentifier;
import se.gottfridn.api.mod.logger.EncapsulatedLogger;
import se.gottfridn.api.mod.logger.EncapsulatedLoggerFactory;
import se.gottfridn.api.mod.version.SubVersion;
import se.gottfridn.api.registration.BlockRegistration;
import se.gottfridn.api.registration.ItemRegistration;
import se.gottfridn.api.mod.version.Version;
import se.gottfridn.api.mod.version.sub.FabricVersion;
import se.gottfridn.api.mod.version.sub.IdentifierVersion;
import se.gottfridn.api.mod.version.sub.NumericalVersion;

public final class BuiMod
	implements ModInitializer {
	public static final ModIdentifier IDENTIFIER = new ModIdentifierFactory("BuiMod");
	public static final EncapsulatedLogger LOGGER = new EncapsulatedLoggerFactory(
			IDENTIFIER.id(), true, true);
	public static final Version VERSION = new Version(new SubVersion[]{
			new IdentifierVersion(IDENTIFIER.id(), false),
			new NumericalVersion("indev", new int[]{0, 0, 1}, 'd'),
			new FabricVersion("0.76.0+1.19.4", "0.14.17", "1.19.4+build.1")});
	public static final ItemRegistration ITEM_REGISTRATION = new ItemRegistration(IDENTIFIER.id(), LOGGER);
	public static final BlockRegistration BLOCK_REGISTRATION = new BlockRegistration(IDENTIFIER.id(), LOGGER);

	@Override
	public void onInitialize() {
		LOGGER.debug("Numerical Version = " + VERSION.getSubVersion(1));
		LOGGER.debug(VERSION.getVerbose());
	}
}