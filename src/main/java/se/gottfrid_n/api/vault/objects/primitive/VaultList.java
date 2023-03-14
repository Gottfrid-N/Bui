package se.gottfrid_n.api.vault.objects.primitive;

import java.util.LinkedList;

public class VaultList {
	public final LinkedList<VaultItemObject> items = new LinkedList<>();
	public final LinkedList<VaultBlockObject> blocks = new LinkedList<>();
}
