package se.gottfrid.bui.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.server.recipe.RecipeJsonProvider;

import java.util.function.Consumer;

public class DataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModelGenerator::new);
	}

	public static class ModelGenerator extends FabricModelProvider {
		public ModelGenerator(FabricDataOutput output) {
			super(output);
		}
		@Override
		public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		}
		@Override
		public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		}
		private void itemModel(ItemModelGenerator itemModelGenerator, Model model) {
			itemModelGenerator.register();
		}
	}

	public static class recipeGenerator extends FabricRecipeProvider {
		public recipeGenerator(FabricDataOutput output) {
			super(output);
		}
		@Override
		public void generate(Consumer<RecipeJsonProvider> exporter) {
		}
	}
}


