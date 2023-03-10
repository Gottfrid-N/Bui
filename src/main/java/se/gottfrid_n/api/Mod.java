package se.gottfrid_n.api;

import se.gottfrid_n.api.objects.Version;
import se.gottfrid_n.api.registration.BlockRegistration;
import se.gottfrid_n.api.registration.ItemRegistration;
import se.gottfrid_n.api.vault.Vault;

public class Mod {
	public final Main main;
	public final ItemRegistration item;
	public final BlockRegistration block;
	public final Vault vault;
	public Mod(String name, boolean log, boolean debugInfo, Version version) {
		this.main = new Main(name, log, debugInfo, version);
		this.item = new ItemRegistration(main);
		this.block = new BlockRegistration(main);
		this.vault = new Vault(main, item, block);
	}
}
