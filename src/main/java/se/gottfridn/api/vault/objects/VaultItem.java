package se.gottfridn.api.vault.objects;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import se.gottfridn.api.vault.objects.primitive.VaultItemObject;
import se.gottfridn.api.vault.objects.primitive.VaultList;

public class VaultItem extends VaultList {
	public VaultItem(String id, Item item, ItemGroup itemGroup) {
		items.addFirst(new VaultItemObject(id, item, itemGroup));
	}
}
