package se.gottfrid.bui.registry;

import net.minecraft.data.client.Model;
import net.minecraft.item.ItemGroup;

public class RegistryElement {
	public final String id;
	public final ItemGroup itemGroup;
	public final Model model;
	public RegistryElement(String id, ItemGroup itemGroup, Model model) {
		this.id = id;
		this.model = model;
		this.itemGroup = itemGroup;
	}
}

