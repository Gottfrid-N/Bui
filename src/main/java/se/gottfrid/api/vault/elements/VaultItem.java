package se.gottfrid.api.vault.elements;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import se.gottfrid.api.vault.elements.base.VaultList;
import se.gottfrid.api.vault.elements.base.VaultObject;

public class VaultItem extends VaultList {
	public VaultItem(String id, ItemGroup itemGroup, Item item) {
		items.addFirst(new VaultObject<>(id, itemGroup, item));
	}
}
