package com.eastcomputing.onemod.core.init;

import com.eastcomputing.onemod.OneMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
            ForgeRegistries.BLOCKS,
            OneMod.MOD_ID
    );

    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register(
            "example_block",
            () -> new Block(
                    BlockBehaviour.Properties.of(
                            Material.WOOD,
                            MaterialColor.COLOR_BLUE
                    ).strength(
                            1.0f,
                            1.0f
                    )
            )
    );
}
