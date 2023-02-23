package se.gottfrid_n.bui.vault;

import net.minecraft.block.MapColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import se.gottfrid_n.api.vault.Vault;
import se.gottfrid_n.api.vault.elements.VaultBlock;
import se.gottfrid_n.api.vault.elements.VaultItem;
import se.gottfrid_n.api.vault.elements.base.VaultList;
import se.gottfrid_n.api.vault.elements.base.VaultObject;

import java.util.HashMap;
import java.util.LinkedList;

public class BuiVault extends Vault {
	public static final VaultList[] vault = new VaultList[]{
			new VaultItem("test_block", ItemGroups.TOOLS, defaultItem())
	};
	public HashMap<String, Item> registry = new HashMap<>();
	private static LinkedList<Item> interpretItem(VaultList item) {
		LinkedList<Item> internalItems = new LinkedList<>();
		for(VaultObject<Item> internalItem : item.items) {
			internalItems.addFirst(BuiItems.registerItem(internalItem.id(),internalItem.object(),"Vault"));
		}
		return internalItems;
	}
}
