package se.gottfrid_n.api.vault;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import se.gottfrid_n.api.Main;
import se.gottfrid_n.api.objects.BlockWithItem;
import se.gottfrid_n.api.objects.ItemWithGroup;
import se.gottfrid_n.api.registration.BlockRegistration;
import se.gottfrid_n.api.registration.ItemRegistration;
import se.gottfrid_n.api.vault.objects.primitive.VaultList;
import se.gottfrid_n.api.vault.objects.primitive.VaultObject;

import java.util.HashMap;
import java.util.LinkedList;

public class Vault {
	public final ItemRegistration item;
	public final BlockRegistration block;
	public final Main main;
	private final LinkedList<VaultList> vault = new LinkedList<>();
	public HashMap<String, Block> blocks = new HashMap<>();
	public HashMap<String, Item> items = new HashMap<>();
	public Vault(Main main, ItemRegistration item, BlockRegistration block) {
		this.main = main;
		this.item = item;
		this.block = block;
	}

	public void toVault(VaultList list) {
		vault.addFirst(list);
	}
	public void interpretVault() {

	}
	private void interpretVaultList(VaultList list) {
		for(VaultObject<ItemWithGroup> vaultObject : list.items) {
			String id = vaultObject.id();
			ItemWithGroup item = vaultObject.object();
			this.items.put(id, this.item.register(id, item.item()));
			this.item.toItemGroup(this.items.get(id), item.itemGroup());
		}
		for(VaultObject<BlockWithItem> vaultObject : list.blocks) {
			String id = vaultObject.id();
			BlockWithItem block = vaultObject.object();
			this.blocks.put(id, this.block.register(id, block.block()));
		}
	}
}
