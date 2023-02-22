package se.gottfrid_n.api.vault;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
// prefix mod id
public abstract class ItemRegistration {
	public static Item lowRegisterItem(String id, Item item, String identifier) {
		return net.minecraft.registry.Registry.register(Registries.ITEM,new Identifier(identifier, id),item);
	}
	public static void lowToItemGroup(Item item, ItemGroup itemGroup) {
		ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(item));
	}
}
