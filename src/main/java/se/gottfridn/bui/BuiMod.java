package se.gottfridn.bui;

import net.fabricmc.api.ModInitializer;
import se.gottfridn.api.identifier.ModIdentifier;
import se.gottfridn.api.identifier.ModIdentifierFactory;
import se.gottfridn.api.logger.EncapsulatedLogger;
import se.gottfridn.api.logger.EncapsulatedLoggerFactory;

public final class BuiMod
	implements ModInitializer {
	public static final ModIdentifier IDENTIFIER = ModIdentifierFactory.getIdentifier("Bui", "non snake¤3.-ä case id");
	public static final EncapsulatedLogger LOGGER = EncapsulatedLoggerFactory.getLogger(IDENTIFIER.getName(), true, true);
	/*public static final Version VERSION = new Version(new SubVersion[]{
			new IdentifierVersion(IDENTIFIER.id(), false),
			new NumericalVersion("indev", new int[]{0, 0, 1}, 'd'),
			new FabricVersion("0.76.0+1.19.4", "0.14.17", "1.19.4+build.1")});*/
	@Override
	public void onInitialize() {
		LOGGER.info("Bui!");
	}
}