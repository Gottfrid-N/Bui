package se.gottfridn.api.registration;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import se.gottfridn.api.objects.EncapsulatedLogger;

public class ItemRegistration
	extends Registration<Item> {

	public ItemRegistration(String identifier, EncapsulatedLogger logger) {
		super(identifier, logger);
	}

	@Override
	public Item register(String id, Item object) {
		logRegister(id);
		return Registry.register(Registries.ITEM, new Identifier(this.identifier, id), object);
	}

	public Item register(String id, Item object, ItemGroup itemGroup) {
		Item item = register(id, object);
		toItemGroup(item, itemGroup);
		return item;
	}

	@Override
	public void logRegister(String id) {
		logger.debug("Registering Item: " + identifier + '/' + id);
	}

	public void toItemGroup(Item item, ItemGroup itemGroup) {
		ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> content.add(item));
	}

}
