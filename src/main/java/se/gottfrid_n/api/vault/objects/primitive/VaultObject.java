package se.gottfrid_n.api.vault.objects.primitive;

public class VaultObject<T> {
	public final String id;
	public final T object;
	public VaultObject(String id, T object) {
		this.id = id;
		this.object = object;
	}
}
