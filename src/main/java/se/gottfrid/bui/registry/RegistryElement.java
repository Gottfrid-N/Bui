package se.gottfrid.bui.registry;

import net.minecraft.data.client.Model;
import net.minecraft.item.ItemGroup;

public class RegistryElement {
	public String ID;
	public ItemGroup ITEMGROUP;
	public Model MODEL;
	public RegistryElement(String id, ItemGroup itemGroup, Model model) {
		ID = id;
		MODEL = model;
		ITEMGROUP = itemGroup;
	}
}

