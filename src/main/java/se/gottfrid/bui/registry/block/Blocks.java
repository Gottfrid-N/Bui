package se.gottfrid.bui.registry.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import se.gottfrid.bui.Main;
import se.gottfrid.bui.registry.Registry;
import se.gottfrid.bui.registry.item.Items;

public class Blocks {
    public static class RegistryInterpreter implements Registry.Interpreter {
        @Override
        public void interpreter() {
            for(RegistryBlock array : Registry.BLOCKS) {
                blockInterpreter(array, "block");
            }
        }
        public void blockInterpreter(RegistryBlock block, String stage) {
                Main.LOGGER.info("Registering "+Main.ID+":"+stage+"/"+block.id);
            final Block internalBlock = block.interpret(block);
                Main.LOGGER.info("Registering "+Main.ID+":"+stage+"Item"+"/"+block.id);
            final Item internalItem = Items.registerItem(block.id, new BlockItem(internalBlock, new FabricItemSettings()));
            Items.addItemToItemGroup(block.itemGroup, internalItem);
        }
    }
    public static Block registerBlock(String id, Block block) {
        return net.minecraft.registry.Registry.register(Registries.BLOCK, new Identifier(Main.ID, id), block);
    }


}
