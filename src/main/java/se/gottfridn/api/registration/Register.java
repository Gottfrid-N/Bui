package se.gottfridn.api.registration;

public interface Register<T> {
	T register(String id, T object);
}
