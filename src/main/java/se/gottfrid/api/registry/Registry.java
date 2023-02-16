package se.gottfrid.api.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public interface Registry {
	Model DEFAULT_ITEM_MODEL = Models.GENERATED;
	Model DEFAULT_BLOCK_MODEL = Models.CUBE_ALL;
	Item DEFAULT_ITEM = new Item(new FabricItemSettings());
}
