package se.gottfrid.bui.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RegistryItem extends RegistryElement {
	public Item ITEM;
	public RegistryItem(String id, ItemGroup itemGroup, Item item, Model model) {
		super(id, itemGroup, model);
		ITEM = item;
	}
	public RegistryItem(String id, ItemGroup itemGroup) {
		super(id, itemGroup, Models.GENERATED);
		ITEM = new Item(new FabricItemSettings());
	}
}
