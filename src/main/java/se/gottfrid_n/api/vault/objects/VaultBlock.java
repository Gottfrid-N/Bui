package se.gottfrid_n.api.vault.objects;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import se.gottfrid_n.api.vault.objects.primitive.VaultBlockObject;
import se.gottfrid_n.api.vault.objects.primitive.VaultList;

public class VaultBlock extends VaultList {
	public VaultBlock(String id, Block block, Item item, ItemGroup itemGroup) {
		blocks.addFirst(new VaultBlockObject(id, block));
	}
}
