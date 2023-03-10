package se.gottfrid_n.api.registration;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import se.gottfrid_n.api.Main;

public class ItemRegistration extends Registration<Item> {
	public ItemRegistration(Main main) {
		super(main, "itemWithGroup");
	}
	@Override
	public Item register(String id, Item object) {
		logRegister(id);
		return Registry.register(Registries.ITEM, new Identifier(main.identifier, id), object);
	}
	public void toItemGroup(Item item, ItemGroup itemGroup) {
		main.logDebug("Sending "+item.toString()+" to "+itemGroup.getDisplayName().getString());
		ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(item));
	}
}
