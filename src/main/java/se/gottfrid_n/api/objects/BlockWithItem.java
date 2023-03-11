package se.gottfrid_n.api.objects;

import net.minecraft.block.Block;

public class BlockWithItem {
	public final Block block;
	public final ItemWithGroup itemWithGroup;
	public BlockWithItem(Block block, ItemWithGroup item) {
		this.block = block;
		this.itemWithGroup = item;
	}
}
