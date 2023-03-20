package se.gottfrid_n.api.objects;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;

public class ItemWithGroup {
	public final Item item;
	public final ItemGroup itemGroup;
	public ItemWithGroup(Item item, ItemGroup itemGroup) {
		this.item = item;
		this.itemGroup = itemGroup;
	}
}
