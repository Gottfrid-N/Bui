package se.gottfridn.api.vault.objects.primitive;

abstract class VaultObject {
	public final String id;
	VaultObject(String id) {
		this.id = id;
	}
}
