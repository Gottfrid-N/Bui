package se.gottfridn.api.registration;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import se.gottfridn.api.mod.logger.EncapsulatedLogger;

public class ItemRegistration
	extends Registration<Item> {
	public ItemRegistration(String identifier, EncapsulatedLogger logger) {
		super(identifier, logger);
	}

	@Override
	public Item register(String id, Item object) {
		logRegister(id, object);
		return Registry.register(Registries.ITEM, new Identifier(this.identifier, id), object);
	}

	@Override
	public void logRegister(String id, Item object) {
		logRegister(id, "item");
		logRegisterDebug(id, object);
	}

	@Override
	protected void logRegisterDebug(String id, Item object) {
		logger.debug("Binding item id: " + id + " to " + object);
	}

	public void toItemGroup(Item item, ItemGroup itemGroup) {
		ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> content.add(item));
	}
}
