package se.gottfrid.bui.registry.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import se.gottfrid.bui.Main;
import se.gottfrid.bui.registry.item.Items;
import se.gottfrid.bui.registry.Registry;
import se.gottfrid.bui.registry.RegistryBlock;

public class Blocks {
    public static void arrayInterpreter() {
        for(RegistryBlock array : Registry.BLOCKS) {
            interpretBlocks(array.ID, array.ITEMGROUP, array.BLOCK, array.BLOCK_ITEM, "Block");
        }
    }
    private static void interpretBlocks(String id, ItemGroup itemGroup, Block block, String blockItem, String stage) {
        final Block internalBlock = registerBlock(id, block, stage);
        //  if(blockItem.equals("BlockItem")) { uncomment when poly of blockItem
            final Item internalItem = Items.registerItem(id, new BlockItem(internalBlock, new FabricItemSettings()), stage+"Item");
            Items.addItemToItemGroup(itemGroup, internalItem);
        //  }
    }
    public static Block registerBlock(String id, Block block, String stage) {
        Main.LOGGER.info("registering "+stage+"/"+id);
        return registerBlock(id, block);
    }
    public static Block registerBlock(String id, Block block) {
        return net.minecraft.registry.Registry.register(Registries.BLOCK, new Identifier(Main.ID, id), block);
    }
}
