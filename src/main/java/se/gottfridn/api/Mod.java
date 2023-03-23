package se.gottfridn.api;

import se.gottfridn.api.objects.EncapsulatedLogger;
import se.gottfridn.api.objects.version.Version;
import se.gottfridn.api.registration.BlockRegistration;
import se.gottfridn.api.registration.ItemRegistration;
import se.gottfridn.bui.Bui;

public interface Mod {

	interface Main
	extends Mod {

		String name();

		String identifier();

		Version version();

		EncapsulatedLogger logger();
	}

	interface Registration
	extends Mod {

		ItemRegistration item();

		BlockRegistration block();

	}

}
