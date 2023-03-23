package se.gottfridn.bui;

import net.fabricmc.api.ModInitializer;
import se.gottfridn.api.Values;
import se.gottfridn.api.objects.version.Version;
import se.gottfridn.api.objects.version.sub.FabricVersion;
import se.gottfridn.api.objects.version.sub.IdentifierVersion;
import se.gottfridn.api.objects.version.sub.NumericalVersion;
import se.gottfridn.api.registration.BlockRegistration;
import se.gottfridn.api.registration.ItemRegistration;

@SuppressWarnings("unused")
public class Bui
implements ModInitializer {
	public static final Values VALUES = new Values("Bui",
			new Version(new Version.Sub[]{
				new IdentifierVersion("bui", false),
				new NumericalVersion("indev", new int[]{0, 0, 1}, 'c'),
				new FabricVersion("0.76.0+1.19.4", "0.14.17", "1.19.4+build.1")}),
			true, true);
	public static final BlockRegistration BLOCKS = new BlockRegistration(VALUES);
	public static final ItemRegistration ITEMS = new ItemRegistration(VALUES);

	@Override
	public void onInitialize() {
		VALUES.logDebug("Numerical Version = " + VALUES.version.getSubVersion(1));
		VALUES.logDebug(VALUES.version.getVerbose());
	}
}