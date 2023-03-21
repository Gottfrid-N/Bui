package se.gottfridn.api.registration;

import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import se.gottfridn.api.Values;

public abstract class RegistrationImpl<T> {
	final Values values;
	final String stage;
	final Registry<T> registry;
	public RegistrationImpl(Values values, String stage, Registry<T> registry) {
		this.values = values;
		this.stage = stage;
		this.registry = registry;
	}
	public T register(String id, T object) {
		logRegister(id);
		return Registry.register(registry, new Identifier(values.identifier, id), object);
	}

	public void logRegister(String id) {
		logRegister(id, stage);
	}
	public void logRegister(String id, String stage) {
		values.logDebug("Registering: "+ values.identifier+":"+stage+"/"+id);
	}
}
