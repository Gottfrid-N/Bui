package se.gottfridn.api.registration;

import se.gottfridn.api.objects.logger.EncapsulatedLogger;

public abstract class Registration<T>
	implements Register<T> {

	public final String identifier;
	public final EncapsulatedLogger logger;

	public Registration(String identifier, EncapsulatedLogger logger) {
		this.identifier = identifier;
		this.logger = logger;
	}

	public abstract void logRegister(String id, T object);

	protected void logRegister(String id, String type) {
		logger.info("Registering " + type + ": " + identifier + '/' + id);
	}

	protected abstract void logRegisterDebug(String id, T object);

}
