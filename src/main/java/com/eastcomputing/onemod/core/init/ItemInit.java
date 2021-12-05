package com.eastcomputing.onemod.core.init;

import com.eastcomputing.onemod.OneMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    // A DeferredRegister is an object that you register things to
    // This registry is not registered though, see the main class where we do this
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS,
            OneMod.MOD_ID);

    // An object to be added to the registry created above
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register(
            "example_item",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))); // set the creative gui tab to MISC
}
