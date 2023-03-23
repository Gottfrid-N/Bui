package se.gottfridn.api.registration;

import se.gottfridn.api.objects.EncapsulatedLogger;

abstract class Registration<T> {

	public final String identifier;
	public final EncapsulatedLogger logger;

	public Registration(String identifier, EncapsulatedLogger logger) {
		this.identifier = identifier;
		this.logger = logger;
	}

	public abstract T register(String id, T object);

	public abstract void logRegister(String id);

}
