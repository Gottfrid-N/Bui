package se.gottfrid.api.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public abstract class ItemRegistration {
	public static Item registerItem(String id, Item item, String identifier) {
		return net.minecraft.registry.Registry.register(Registries.ITEM,new Identifier(identifier, id),item);
	}
	public static void toItemGroup(Item item, ItemGroup itemGroup) {
		ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(item));
	}
}
