package se.gottfrid_n.api.vault.elements;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import se.gottfrid_n.api.vault.elements.base.VaultList;
import se.gottfrid_n.api.vault.elements.base.VaultObject;

import java.util.LinkedList;

public class VaultBlock extends VaultList {
	public VaultBlock(String id, ItemGroup itemGroup, Block block) {
		//TODO block item support
		blocks.addFirst(new VaultObject<>(id, itemGroup, block));
	}
}
