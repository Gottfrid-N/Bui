package se.gottfrid.bui.registry.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import se.gottfrid.bui.Main;
import se.gottfrid.bui.registry.Registry;
import se.gottfrid.bui.registry.RegistryItem;

public class Items {
    // check se.gottfrid.bui.registry.Registry.ITEMS for most items
    public static void arrayInterpreter() {
        for(RegistryItem array : Registry.ITEMS) {
            interpretItemArray(array.ID, array.ITEMGROUP, array.ITEM, "item");
        }
    }
    public static void interpretItemArray(String id, ItemGroup itemGroup, Item item, String stage) {
        final Item internalItem = registerItem(id, item, stage);
        addItemToItemGroup(itemGroup, internalItem);
    }
    public static Item registerItem(String id, Item item, String stage) {
        Main.LOGGER.info("registering "+stage+"/"+id);
        return registerItem(id, item);
    }
    public static Item registerItem(String id, Item item) {
        return net.minecraft.registry.Registry.register(Registries.ITEM,new Identifier(Main.ID,id),item);
    }
    public static void addItemToItemGroup(ItemGroup itemGroup, Item item) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(item));
    }
}
