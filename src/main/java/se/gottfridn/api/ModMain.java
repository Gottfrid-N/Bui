package se.gottfridn.api;

import se.gottfridn.api.objects.EncapsulatedLogger;
import se.gottfridn.api.objects.version.Version;

public interface ModMain {
	String name();
	String identifier();
	Version version();

	EncapsulatedLogger logger();
}
