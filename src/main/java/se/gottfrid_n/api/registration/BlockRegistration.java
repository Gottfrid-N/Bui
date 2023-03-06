package se.gottfrid_n.api.registration;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import se.gottfrid_n.api.Main;

public class BlockRegistration extends Registration<Block> {
	public BlockRegistration(Main main) {
		super(main);
	}
	@Override
	public Block defualt() {
		return new Block(FabricBlockSettings.of(Material.METAL, MapColor.WHITE));
	}
	@Override
	public Block register(String id, Block block, String stage) {
		if(main.log) {
			main.logRegister(id, stage);
		}
		return Registry.register(Registries.BLOCK, new Identifier(main.identifier, id), block);
	}
}
