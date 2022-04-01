package com.huskytacodile.alternacraft.item;

import com.huskytacodile.alternacraft.AlternaCraft;
import com.huskytacodile.alternacraft.entity.ModEntityTypes;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item JPSPINO_SPAWN_EGG = registerItem("jpspino_spawn_egg",
            new SpawnEggItem(ModEntityTypes.JPSPINO,0xfcb603, 0x242321,
                    new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(AlternaCraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + AlternaCraft.MOD_ID);
    }
}
