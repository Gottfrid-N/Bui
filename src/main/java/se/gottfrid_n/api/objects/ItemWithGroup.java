package se.gottfrid_n.api.objects;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public record ItemWithGroup(Item item, ItemGroup itemGroup) {}
