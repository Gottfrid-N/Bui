package se.gottfrid_n.api.vault.objects.primitive;

import se.gottfrid_n.api.objects.BlockWithItem;
import se.gottfrid_n.api.objects.ItemWithGroup;

import java.util.LinkedList;

public class VaultList {
	public LinkedList<VaultObject<ItemWithGroup>> items = new LinkedList<>();
	public LinkedList<VaultObject<BlockWithItem>> blocks = new LinkedList<>();
}
