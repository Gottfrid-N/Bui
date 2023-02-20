package se.gottfrid.bui.item;

import net.minecraft.item.Item;
import se.gottfrid.api.item.ItemRegistration;
import se.gottfrid.bui.Bui;

public class Items extends ItemRegistration {
    public static Item registerItem(String id, Item item, String stage) {
        Bui.logRegister(id, "item", stage);
        return registerItem(id, item);
    }
    public static Item registerItem(String id, Item item) {
        return registerItem(id, item, Bui.IDENTIFIER);
    }
}
