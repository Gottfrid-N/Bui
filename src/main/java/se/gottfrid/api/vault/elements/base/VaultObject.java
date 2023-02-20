package se.gottfrid.api.vault.elements.base;

import net.minecraft.item.ItemGroup;

public record VaultObject<T>(String id, ItemGroup itemGroup, T object) {
}
