package se.gottfrid_n.api.registration;

import se.gottfrid_n.api.Main;

public abstract class Registration<T> {
	public final Main main;
	public final String stage;
	public Registration(Main main, String stage) {
		this.main = main;
		this.stage = stage;
	}
	public abstract T register(String id, T object);
	public void logRegister(String id) {
		logRegister(id, stage);
	}
	public void logRegister(String id, String stage) {
		main.logDebug("Registering: "+main.identifier+":"+stage+"/"+id);
	}
}
