package se.gottfrid.bui.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.data.client.*;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.recipe.book.RecipeCategory;
import se.gottfrid.bui.Registry;
import se.gottfrid.bui.block.Blocks;
import se.gottfrid.bui.item.Items;

import java.util.function.Consumer;

public class DataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModelGenerator::new);
	}
}
class ModelGenerator extends FabricModelProvider {
	public ModelGenerator(FabricDataOutput output) {
		super(output);
	}
	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		blockStateModelGenerator.registerSimpleCubeAll(Blocks.TEST_BLOCK);
	}
	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		itemModelGenerator.register(Registry.registerSimpleRegistryItem("nameofitem", ItemGroups.TOOLS), Models.GENERATED);
	}
}
class recipeGenerator extends FabricRecipeProvider {
	public recipeGenerator(FabricDataOutput output) {
		super(output);
	}
	@Override
	public void generate(Consumer<RecipeJsonProvider> exporter) {
	}
}
