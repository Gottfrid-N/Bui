package se.gottfrid_n.api.vault.objects;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import se.gottfrid_n.api.vault.objects.primitive.VaultItemObject;
import se.gottfrid_n.api.vault.objects.primitive.VaultList;

public class VaultItem extends VaultList {
	public VaultItem(String id, Item item, ItemGroup itemGroup) {
		items.addFirst(new VaultItemObject(id, item, itemGroup));
	}
}
