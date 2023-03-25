package se.gottfridn.bui;

import net.fabricmc.api.ModInitializer;
import se.gottfridn.library.identifier.ModIdentifier;
import se.gottfridn.library.identifier.ModIdentifierFactory;
import se.gottfridn.library.identifier.Stability;
import se.gottfridn.library.logger.EncapsulatedLogger;
import se.gottfridn.library.logger.EncapsulatedLoggerFactory;
import se.gottfridn.library.version.SubVersion;
import se.gottfridn.library.version.Version;
import se.gottfridn.library.version.VersionFactory;

public final class BuiMain
	implements ModInitializer {
	public static final ModIdentifier IDENTIFIER = ModIdentifierFactory.getIdentifier("Bui", "bui", Stability.CHAOS);
	public static final Version VERSION = VersionFactory.getVersion(IDENTIFIER, new SubVersion[]{new SubVersion() {
		@Override
		public String getVersion() {
			return "lib_dev-0.0.01a";
		}
	}});
	public static final EncapsulatedLogger LOGGER = EncapsulatedLoggerFactory.getLogger(IDENTIFIER.getName(), true, true);

	@Override
	public void onInitialize() {
		LOGGER.info("Bui!");
		LOGGER.debug(VERSION.getVersion());
	}
}