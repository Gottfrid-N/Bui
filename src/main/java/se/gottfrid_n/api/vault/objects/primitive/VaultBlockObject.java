package se.gottfrid_n.api.vault.objects.primitive;

import net.minecraft.block.Block;

public class VaultBlockObject extends VaultObject {
	public final Block block;
	public VaultBlockObject(String id, Block block) {
		super(id);
		this.block = block;
	}
}
