package se.gottfrid_n.api.vault.objects.primitive;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class VaultItemObject extends VaultObject {
	public final Item item;
	public final ItemGroup itemGroup;
	public VaultItemObject(String id, Item item, ItemGroup itemGroup) {
		super(id);
		this.item = item;
		this.itemGroup = itemGroup;
	}
}
