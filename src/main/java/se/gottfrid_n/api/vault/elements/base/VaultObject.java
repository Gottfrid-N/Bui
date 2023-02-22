package se.gottfrid_n.api.vault.elements.base;

import net.minecraft.item.ItemGroup;

public record VaultObject<T>(String id, ItemGroup itemGroup, T object) {
}
