package se.gottfrid.bui.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import se.gottfrid.api.item.ItemRegistration;
import se.gottfrid.api.vault.elements.VaultBlockRecord;
import se.gottfrid.bui.Bui;
import se.gottfrid.bui.BuiVault;

public class Blocks {
   public static class RegistryInterpreter {
        public static void interpreter() {
            for(VaultBlockRecord array : BuiVault.BLOCKS) {
                blockInterpreter(array, "block");
            }
        }
        public static void blockInterpreter(VaultBlockRecord block, String stage) {
            Bui.logRegister(block.id, stage);
            final Block internalBlock = block.interpret(Bui.IDENTIFIER);
            Bui.logRegister(block.id, stage+"Item");
            final Item internalItem = ItemRegistration.registerItem(block.id, new BlockItem(internalBlock, new FabricItemSettings()), Bui.IDENTIFIER);
            ItemRegistration.toItemGroup(internalItem, block.itemGroup);
        }
    }



}
