package se.gottfrid.bui.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Rarity;
import se.gottfrid.bui.Main;

public class Items extends se.gottfrid.bui.Registry {
    // check se.gottfrid.bui.Registry for most items
    public static final Item TEST_ITEM = registerRegistryItem("test_item", ItemGroups.TOOLS, new Item(new FabricItemSettings().rarity(Rarity.EPIC)));

    public static void registerBuiItems() {
        Main.LOGGER.info("Registering Items for " + Main.ID + Main.VERSION);
    }
}
