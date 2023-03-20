package se.gottfridn.api.registration;

import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import se.gottfridn.api.Main;

public abstract class Registration<T> {
	final Main main;
	final String stage;
	final Registry<T> registry;
	public Registration(Main main, String stage, Registry<T> registry) {
		this.main = main;
		this.stage = stage;
		this.registry = registry;
	}
	public T register(String id, T object) {
		logRegister(id);
		return Registry.register(registry, new Identifier(main.identifier, id), object);
	}

	public void logRegister(String id) {
		logRegister(id, stage);
	}
	public void logRegister(String id, String stage) {
		main.logDebug("Registering: "+main.identifier+":"+stage+"/"+id);
	}
}
