package se.gottfrid_n.api.registration;

import se.gottfrid_n.api.Main;

public abstract class Registration<T> {
	public final Main main;
	public Registration(Main main) {
		this.main = main;
	}
	public abstract T defualt();
	public abstract T register(String id, T object, String stage);
	public T register(String id, String stage) {
		return register(id, defualt(), stage);
	}
}
