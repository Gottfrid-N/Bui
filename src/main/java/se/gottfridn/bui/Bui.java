package se.gottfridn.bui;

import net.fabricmc.api.ModInitializer;
import se.gottfridn.api.objects.version.Version;
import se.gottfridn.api.objects.version.sub.FabricVersion;
import se.gottfridn.api.objects.version.sub.IdentifierVersion;
import se.gottfridn.api.objects.version.sub.NumericalVersion;

public final class Bui
	implements ModInitializer {

	public Version version() {
		return new Version(new Version.Sub[]{
				new IdentifierVersion(identifier(), false),
				new NumericalVersion("indev", new int[]{0, 0, 1}, 'd'),
				new FabricVersion("0.76.0+1.19.4", "0.14.17", "1.19.4+build.1")});
	}

	@Override
	public void onInitialize() {
		logger().debug("Numerical Version = " + version().getSubVersion(1));
		logger().debug(version().getVerbose());
	}

}