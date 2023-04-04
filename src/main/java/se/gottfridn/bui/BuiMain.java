package se.gottfridn.bui;

import net.fabricmc.api.ModInitializer;
import se.gottfridn.library.identifier.ModIdentifier;
import se.gottfridn.library.identifier.Stability;
import se.gottfridn.library.identifier.factory.ModIdentifierFactory;
import se.gottfridn.library.logger.EncapsulatedLogger;
import se.gottfridn.library.logger.factory.EncapsulatedLoggerFactory;
import se.gottfridn.library.version.SubVersion;
import se.gottfridn.library.version.Version;
import se.gottfridn.library.version.factory.SubVersionFactory;
import se.gottfridn.library.version.factory.VersionFactory;

public final class BuiMain
	implements ModInitializer {
	public static final ModIdentifier IDENTIFIER = ModIdentifierFactory.getIdentifier("Bui", Stability.DEVELOPMENT);
	public static final EncapsulatedLogger LOGGER = EncapsulatedLoggerFactory.getLogger(IDENTIFIER.getName(), true, true);

	private static final SubVersion IDENTIFIER_SUB_VERSION = SubVersionFactory.getIdentifierSubVersion(IDENTIFIER);

	private static final String NUMERICAL_IDENTIFIER = "libdev1237891237891237899123789781238927137812397";
	private static final Number MAJOR = 0;
	private static final Number MEDIUM = 1;
	private static final Number MINOR = 1;
	private static final Number GIT = 1;
	private static final Number[] NUMERICAL_PART = {MAJOR, MEDIUM, MINOR, GIT};
	private static final SubVersion NUMERICAL_SUB_VERSION = SubVersionFactory.getNumericalSubVersion(NUMERICAL_IDENTIFIER, NUMERICAL_PART);

	public static final Version VERSION = VersionFactory.getVersion(new SubVersion[]{IDENTIFIER_SUB_VERSION, NUMERICAL_SUB_VERSION});

	@Override
	public void onInitialize() {
		LOGGER.info("Bui!");
		LOGGER.debug(VERSION.toVersionFormat());
	}
}