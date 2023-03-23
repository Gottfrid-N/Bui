package se.gottfridn.bui;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import se.gottfridn.api.Mod;
import se.gottfridn.api.objects.DefaultLogger;
import se.gottfridn.api.objects.EncapsulatedLogger;
import se.gottfridn.api.objects.version.Version;
import se.gottfridn.api.objects.version.sub.FabricVersion;
import se.gottfridn.api.objects.version.sub.IdentifierVersion;
import se.gottfridn.api.objects.version.sub.NumericalVersion;
import se.gottfridn.api.registration.BlockRegistration;
import se.gottfridn.api.registration.ItemRegistration;

public final class Bui
	implements
		ModInitializer,
		Mod.Main,
		Mod.Registration {

	@Override
	public String name() {
		return "bui";
	}

	@Override
	public String identifier() {
		return name().toLowerCase();
	}

	@Override
	public Version version() {
		return new Version(new Version.Sub[]{
				new IdentifierVersion(identifier(), false),
				new NumericalVersion("indev", new int[]{0, 0, 1}, 'd'),
				new FabricVersion("0.76.0+1.19.4", "0.14.17", "1.19.4+build.1")});
	}

	@Override
	public EncapsulatedLogger logger() {
		return new DefaultLogger(identifier(), true, true);
	}

	@Override
	public ItemRegistration item() {
		return new ItemRegistration(identifier(), logger());
	}

	@Override
	public BlockRegistration block() {
		return new BlockRegistration(identifier(), logger());
	}

	public static final Item TEST_ITEM = item()

	@Override
	public void onInitialize() {
		logger().debug("Numerical Version = " + version().getSubVersion(1));
		logger().debug(version().getVerbose());
	}

}