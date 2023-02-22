package se.gottfrid.bui.vault;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import se.gottfrid.api.vault.ItemRegistration;
import se.gottfrid.bui.Bui;

public class BuiItems extends ItemRegistration {
    public static Item registerBlockItem(Block block, BlockItem item) {

    }
    public static Item registerItem(String id, Item item, String stage) {
        Bui.logRegister(id, "item", stage);
        return registerItem(id, item);
    }
    public static Item registerItem(String id, Item item) {
        return lowRegisterItem(id, item, Bui.IDENTIFIER);
    }
    public static void toItemGroup(Item item, ItemGroup itemGroup) {
        lowToItemGroup(item, itemGroup);
    }
}
