package se.gottfrid_n.api.vault.elements;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import se.gottfrid_n.api.vault.elements.base.VaultList;
import se.gottfrid_n.api.vault.elements.base.VaultObject;

import java.util.LinkedList;

public class VaultItem extends VaultList {
	public VaultItem(String id, ItemGroup itemGroup, Item item) {
		items.addFirst(new VaultObject<>(id, itemGroup, item));
	}
}
