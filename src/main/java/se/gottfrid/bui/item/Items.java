package se.gottfrid.bui.item;

import net.minecraft.item.Item;
import se.gottfrid.api.item.ItemRegistration;
import se.gottfrid.api.registry.ItemInterpreter;
import se.gottfrid.api.registry.elements.RegistryItem;
import se.gottfrid.bui.Main;
import se.gottfrid.bui.Registry;

public class Items implements ItemInterpreter {
    @Override
    public void interpreter() {
        for(RegistryItem array : Registry.ITEMS) {
            itemInterpreter(array, "item");
        }
    }
    @Override
    public void itemInterpreter(RegistryItem item, String stage) {
        Main.logRegister(item.id, stage);
        final Item internalItem = item.interpret(Main.ID);
        ItemRegistration.toItemGroup(internalItem, item.itemGroup);
    }
}
