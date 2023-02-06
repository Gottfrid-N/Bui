package se.gottfrid.bui.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import se.gottfrid.bui.Main;

public class Blocks {
    public static final Block TEST_BLOCK = registerBlock("test_block", ItemGroups.TOOLS,
            new Block(FabricBlockSettings.of(Material.SOIL).strength(4f).requiresTool()));
    public static final Block ARCHITECTURAL_STEEL_BLOCK = registerBlock("architectural_steel_block", ItemGroups.BUILDING_BLOCKS,
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()));
    private static Block registerBlock(String name, ItemGroup itemGroup,Block block) {
        registerBlockItem(name, itemGroup, block);
        return Registry.register(Registries.BLOCK, new Identifier(Main.ID, name), block);
    }

    private static Item registerBlockItem(String name,  ItemGroup itemGroup, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Main.ID, name), new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(block));
        return item;
    }
    public static void registerBuiBlocks() {
        Main.LOGGER.info("Registering Blocks for " + Main.ID);
    }
}
