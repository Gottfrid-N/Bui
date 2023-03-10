package se.gottfrid_n.api.vault.objects.primitive;

public record VaultObject<T>(String id, T object) {}
