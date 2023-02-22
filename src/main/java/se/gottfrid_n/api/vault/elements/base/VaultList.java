package se.gottfrid_n.api.vault.elements.base;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.LinkedList;

public abstract class VaultList {
	public LinkedList<VaultObject<Item>> items;
	public LinkedList<VaultObject<Block>> blocks;
}
