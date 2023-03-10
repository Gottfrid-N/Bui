package se.gottfrid_n.api.objects;

import net.minecraft.block.Block;

public record BlockWithItem(Block block, ItemWithGroup itemWithGroup) {}
