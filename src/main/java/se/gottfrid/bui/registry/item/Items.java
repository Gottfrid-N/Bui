package se.gottfrid.bui.registry.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import se.gottfrid.bui.Main;
import se.gottfrid.bui.registry.Registry;

public class Items {
    public static class RegistryInterpreter implements Registry.Interpreter {
        @Override
        public void interpreter() {
            for(RegistryItem array : Registry.ITEMS) {
                itemInterpreter(array, "item");
            }
        }
        public void itemInterpreter(RegistryItem item, String stage) {
                Main.LOGGER.info("Registering "+Main.ID+":"+stage+"/"+item.id);
            final Item internalItem = item.interpret(item);
            Items.addItemToItemGroup(item.itemGroup, internalItem);
        }
    }
    public static Item registerItem(String id, Item item) {
        return net.minecraft.registry.Registry.register(Registries.ITEM,new Identifier(Main.ID,id),item);
    }
    public static void addItemToItemGroup(ItemGroup itemGroup, Item item) {
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(item));
    }


}
