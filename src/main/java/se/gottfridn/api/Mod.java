package se.gottfridn.api;

import se.gottfridn.api.registration.BlockRegistration;
import se.gottfridn.api.registration.ItemRegistration;
import se.gottfridn.api.vault.Vault;

@SuppressWarnings("unused")
public class Mod {
	public final Values values;
	public final ItemRegistration item;
	public final BlockRegistration block;
	public final Vault vault;
	public Mod(Values values) {
		this.values = values;
		this.item = new ItemRegistration(this.values);
		this.block = new BlockRegistration(this.values);
		this.vault = new Vault(this.item, this.block);
	}
	// shortcuts
	public void logInfo(String info) {
		this.values.logInfo(info);
	}
	public void logDebug(String debug) {
		this.values.logDebug(debug);
	}
	public void logWarn(String warn) {
		this.values.logDebug(warn);
	}
	public void logError(String error) {
		this.values.logDebug(error);
	}
}
