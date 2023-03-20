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
	final ItemRegistration item;
	final BlockRegistration block;
	final Main main;
	public Vault(Main main, ItemRegistration item, BlockRegistration block) {
		this.main = main;
		this.item = item;
		this.block = block;
	}
	private final LinkedList<VaultList> vault = new LinkedList<>();
	public HashMap<String, Block> blocks = new HashMap<>();
	public HashMap<String, Item> items = new HashMap<>();

	public void add(VaultList list) {
		vault.addFirst(list);
	}

	public void interpret() {
		for(VaultList list : vault) {
			interpretVaultList(list);
		}
	}
	private void interpretVaultList(VaultList list) {
		for(VaultObject<ItemWithGroup> item : list.items) {
			interpretItem(item.id, item.object);
		}
		for(VaultObject<BlockWithItem> block : list.blocks) {
			interpretBlock(block.id, block.object);
			interpretItem(block.id, block.object.itemWithGroup);
		}
	}
	private void interpretItem(String id, ItemWithGroup object) {
		this.items.put(id, this.item.register(id, object.item));
		this.item.toItemGroup(this.items.get(id), object.itemGroup);
	}
	private void interpretBlock(String id, BlockWithItem object) {
		this.blocks.put(id, this.block.register(id, object.block));
	}
}
