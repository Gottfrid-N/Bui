package se.gottfrid.bui.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import se.gottfrid.api.item.ItemRegistration;
import se.gottfrid.api.registry.elements.RegistryBlock;
import se.gottfrid.bui.Main;
import se.gottfrid.bui.Registry;

public class Blocks {
   public static class RegistryInterpreter {
        public static void interpreter() {
            for(RegistryBlock array : Registry.BLOCKS) {
                blockInterpreter(array, "block");
            }
        }
        public static void blockInterpreter(RegistryBlock block, String stage) {
            Main.logRegister(block.id, stage);
            final Block internalBlock = block.interpret(Main.ID);
            Main.logRegister(block.id, stage+"Item");
            final Item internalItem = ItemRegistration.registerItem(block.id, new BlockItem(internalBlock, new FabricItemSettings()), Main.ID);
            ItemRegistration.toItemGroup(internalItem, block.itemGroup);
        }
    }



}
