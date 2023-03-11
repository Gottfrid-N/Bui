package se.gottfrid_n.api.registration;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import se.gottfrid_n.api.Main;

public class ItemRegistration extends Registration<Item> {
	public ItemRegistration(Main main) {
		super(main, "item", Registries.ITEM);
	}
	public void toItemGroup(Item item, ItemGroup itemGroup) {
		main.logDebug("Sending "+item.toString()+" to "+itemGroup.getDisplayName().getString());
		ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> {
			content.add(item);
		});
	}
}
