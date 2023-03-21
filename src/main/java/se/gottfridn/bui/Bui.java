package se.gottfridn.bui;

import net.fabricmc.api.ModInitializer;
import se.gottfridn.api.ApiMod;
import se.gottfridn.api.Values;
import se.gottfridn.api.objects.version.Version;

public class Bui implements ModInitializer {
	public static final ApiMod BUI = new ApiMod(new Values("Bui",
			new Version(new Version.Identifier("bui", false),
				new Version.Numerical("indev", (byte) 0, (byte) 0, (byte) 1, 'b'),
				new Version.Fabric("0.76.0+1.19.4", "0.14.17", "1.19.4+build.1")),
			true, true));
	@Override
	public void onInitialize() {

		BUI.logDebug(BUI.values.version.getVerbose());
	}
}