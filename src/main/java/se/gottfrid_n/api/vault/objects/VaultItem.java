package se.gottfrid_n.api.vault.objects;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import se.gottfrid_n.api.objects.ItemWithGroup;
import se.gottfrid_n.api.vault.objects.primitive.VaultList;
import se.gottfrid_n.api.vault.objects.primitive.VaultObject;

public class VaultItem extends VaultList {
	public VaultItem(String id, Item item, ItemGroup itemGroup) {
		items.addFirst(new VaultObject<>(id, new ItemWithGroup(item, itemGroup)));
	}
}
