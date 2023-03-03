package se.gottfrid_n.api;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistration {
	public final Main main;
	public final Item defualtItem = new Item(new FabricItemSettings());
	public ItemRegistration(Main main) {
		this.main = main;
	}
	public Item register(String id, Item item, String stage) {
		if(main.log) {
			main.logRegister(id, stage);
		}
		return Registry.register(Registries.ITEM, new Identifier(main.identifier, id), item);
	}
	public Item register(String id, String stage) {
		return register(id, defualtItem, stage);
	}
	public void toItemGroup(Item item, ItemGroup itemGroup) {
		if(main.log) {
			main.logToItemGroup(item, itemGroup);
		}
		ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(item));
	}
}
