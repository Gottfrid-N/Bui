package se.gottfrid_n.api.vault.objects;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import se.gottfrid_n.api.objects.BlockWithItem;
import se.gottfrid_n.api.objects.ItemWithGroup;
import se.gottfrid_n.api.vault.objects.primitive.VaultList;
import se.gottfrid_n.api.vault.objects.primitive.VaultObject;

public class VaultBlock extends VaultList {
	public VaultBlock(String id, Block block, BlockItem item, ItemGroup itemGroup) {
		blocks.addFirst(new VaultObject<>(id,
				new BlockWithItem(block,
				new ItemWithGroup(item, itemGroup))));
	}
}
