package se.gottfridn.bui;

import net.fabricmc.api.ModInitializer;
import se.gottfridn.library.identifier.ModIdentifier;
import se.gottfridn.library.identifier.ModIdentifierFactory;
import se.gottfridn.library.identifier.Stability;
import se.gottfridn.library.logger.EncapsulatedLogger;
import se.gottfridn.library.logger.EncapsulatedLoggerFactory;
import se.gottfridn.library.version.SubVersion;
import se.gottfridn.library.version.SubVersionFactory;
import se.gottfridn.library.version.Version;
import se.gottfridn.library.version.VersionFactory;

public final class BuiMain
	implements ModInitializer {
	public static final ModIdentifier IDENTIFIER = ModIdentifierFactory.getIdentifier("Bui", Stability.DEV);
	public static final EncapsulatedLogger LOGGER = EncapsulatedLoggerFactory.getLogger(IDENTIFIER.getName(), true, true);

	private static final SubVersion IDENTIFIER_SUB_VERSION = SubVersionFactory.getIdentifierSubVersion(IDENTIFIER);
	private static final SubVersion NUMERICAL_SUB_VERSION = SubVersionFactory.getNumericalSubVersion("libdev", new Integer[]{0, 0, 1}, 'a');
	public static final Version VERSION = VersionFactory.getVersion(new SubVersion[]{IDENTIFIER_SUB_VERSION, NUMERICAL_SUB_VERSION});

	@Override
	public void onInitialize() {
		LOGGER.info("Bui!");
		LOGGER.debug(VERSION.toVersionFormat());
	}
}