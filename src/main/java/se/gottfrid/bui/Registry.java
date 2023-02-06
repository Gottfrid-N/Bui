package se.gottfrid.bui;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class Registry {
	public static final Item ARCHITECTURAL_STEEL = registerRegistryItem("architectural_steel", ItemGroups.INGREDIENTS,
			new Item(new FabricItemSettings()));
	public static final Item SIMPLE_TEST_ITEM = registerSimpleRegistryItem("simple_test_item", ItemGroups.TOOLS);


	// topLevelMethods

	// itemMethods
	public static Item registerSimpleRegistryItem(String name, ItemGroup itemGroup) {
		registerRegistryItem(name + "_2", itemGroup, new Item(new FabricItemSettings()));
		return registerRegistryItem(name, itemGroup, new Item(new FabricItemSettings()));
	}
	public static Item registerRegistryItem(String name, ItemGroup itemGroup, Item item) {
		addToItemGroup(itemGroup, item);
		return net.minecraft.registry.Registry.register(Registries.ITEM, new Identifier(Main.ID, name), item);
	}

		// itemGroupMethods
		public static void addToItemGroup(ItemGroup itemGroup, Item item) {ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(item));}
	// blockMethods

}
