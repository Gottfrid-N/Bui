package se.gottfrid_n.api;

import se.gottfrid_n.api.registration.BlockRegistration;
import se.gottfrid_n.api.registration.ItemRegistration;
import se.gottfrid_n.api.vault.Vault;

public class Mod {
	public final Main main;
	public final ItemRegistration item;
	public final BlockRegistration block;
	public final Vault vault;
	public Mod(Main main) {
		this.main = main;
		this.item = new ItemRegistration(this.main);
		this.block = new BlockRegistration(this.main);
		this.vault = new Vault(this.item, this.block);
	}
}
