package se.gottfridn.api.registration;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import se.gottfridn.api.Values;

public class ItemRegistration extends Registration<Item> {
	public ItemRegistration(Values values) {
		super(values, "item", Registries.ITEM);
	}
	public void toItemGroup(Item item, ItemGroup itemGroup) {
		values.logDebug("Sending "+item.toString()+" to "+itemGroup.getDisplayName().getString());
		ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> content.add(item));
	}
}
