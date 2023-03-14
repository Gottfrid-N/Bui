package se.gottfrid_n.api.vault;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import se.gottfrid_n.api.registration.BlockRegistration;
import se.gottfrid_n.api.registration.ItemRegistration;
import se.gottfrid_n.api.registration.Registration;
import se.gottfrid_n.api.vault.objects.primitive.VaultBlockObject;
import se.gottfrid_n.api.vault.objects.primitive.VaultItemObject;
import se.gottfrid_n.api.vault.objects.primitive.VaultList;

import java.util.HashMap;
import java.util.LinkedList;

public class Vault {
	final ItemRegistration item;
	final BlockRegistration block;
	public Vault(ItemRegistration item, BlockRegistration block) {
		this.item = item;
		this.block = block;
	}
	private final LinkedList<VaultList> vault = new LinkedList<>();
	public final HashMap<String, Block> blocks = new HashMap<>();
	public final HashMap<String, Item> items = new HashMap<>();

	public void add(VaultList list) {
		vault.addLast(list);
	}

	public void interpret() {
		for(VaultList list : vault) {
			interpretVaultList(list);
		}
	}
	private void interpretVaultList(VaultList list) {
		for(VaultItemObject vaultItem : list.items) {
			interpretItem(vaultItem);
		}
		for(VaultBlockObject vaultBlock : list.blocks) {
			interpretBlock(vaultBlock);
		}
	}
	private void interpretItem(VaultItemObject vaultItem) {
		interpretObject(item, items, vaultItem.id, vaultItem.item);
		if(vaultItem.itemGroup == null) {return;}
		this.item.toItemGroup(this.items.get(vaultItem.id), vaultItem.itemGroup);
	}
	private void interpretBlock(VaultBlockObject vaultBlock) {
		interpretObject(block, blocks, vaultBlock.id, vaultBlock.block);
	}
	private <T> void interpretObject(Registration<T> registration, HashMap<String, T> map, String id, T object ) {
		map.put(id, registration.register(id, object));
	}
}
