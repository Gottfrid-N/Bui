package se.gottfrid.api.registry.elements;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import se.gottfrid.api.item.ItemRegistration;

public class RegistryItem extends RegistryElement {
	public final Item item;
	public RegistryItem(String id, ItemGroup itemGroup, Item item, Model model) {
		super(id, itemGroup, model);
		this.item = item;
	}
	public RegistryItem(String id, ItemGroup itemGroup) {
		super(id, itemGroup, Models.GENERATED);
		this.item = new Item(new FabricItemSettings());
	}
	public Item interpret(String identifier) {
		return ItemRegistration.registerItem(this.id, this.item, identifier);
	}
}
