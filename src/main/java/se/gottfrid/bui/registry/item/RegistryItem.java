package se.gottfrid.bui.registry.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import se.gottfrid.bui.registry.RegistryElement;

public class RegistryItem extends RegistryElement {
	public final Item item;

	public RegistryItem(String id, ItemGroup itemGroup, Item item, Model model) {
		super(id, itemGroup, model);
		this.item = item;
	}

	public RegistryItem(String id, ItemGroup itemGroup) {
		super(id, itemGroup, Models.GENERATED);
		item = new Item(new FabricItemSettings());
	}
	public Item interpret(RegistryItem item) {
		return Items.registerItem(item.id, item.item);
	}
}
