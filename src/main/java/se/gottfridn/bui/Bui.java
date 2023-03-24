package se.gottfridn.bui;

import net.fabricmc.api.ModInitializer;
import se.gottfridn.api.mod.identifier.ModIdentifierFactory;
import se.gottfridn.api.mod.identifier.ModIdentifier;
import se.gottfridn.api.mod.logger.EncapsulatedLogger;
import se.gottfridn.api.mod.logger.EncapsulatedLoggerFactory;
import se.gottfridn.api.registration.BlockRegistration;
import se.gottfridn.api.registration.ItemRegistration;
import se.gottfridn.api.version.Version;
import se.gottfridn.api.version.sub.FabricVersion;
import se.gottfridn.api.version.sub.IdentifierVersion;
import se.gottfridn.api.version.sub.NumericalVersion;

public final class Bui
	implements ModInitializer {

	public static final ModIdentifier ID = new ModIdentifierFactory("Bui");

	public static final EncapsulatedLogger LOGGER = new EncapsulatedLoggerFactory(
			ID.getIdentifier(), true, true);

	public static final Version VERSION = new Version(new Version.Sub[]{
			new IdentifierVersion(ID.getIdentifier(), false),
			new NumericalVersion("indev", new int[]{0, 0, 1}, 'd'),
			new FabricVersion("0.76.0+1.19.4", "0.14.17", "1.19.4+build.1")});

	public static final class Registration {

		public static final ItemRegistration item = new ItemRegistration(ID.getIdentifier(), LOGGER);
		public static final BlockRegistration block = new BlockRegistration(ID.getIdentifier(), LOGGER);

	}

	@Override
	public void onInitialize() {
		LOGGER.debug("Numerical Version = " + VERSION.getSubVersion(1));
		LOGGER.debug(VERSION.getVerbose());
	}

}