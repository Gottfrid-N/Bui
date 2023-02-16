package se.gottfrid.api.registry.elements;

import net.minecraft.data.client.Model;
import net.minecraft.item.ItemGroup;

public abstract class RegistryElement {
	public final String id;
	public final ItemGroup itemGroup;
	public final Model model;
	public RegistryElement(String id, ItemGroup itemGroup, Model model) {
		this.id = id;
		this.model = model;
		this.itemGroup = itemGroup;
	}
}

