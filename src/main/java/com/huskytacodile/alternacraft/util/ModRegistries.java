package com.huskytacodile.alternacraft.util;

import com.huskytacodile.alternacraft.entity.JPSpinosaurusEntity;
import com.huskytacodile.alternacraft.entity.ModEntityTypes;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModRegistries {
    public static void registerModStuffs() {
        registerAttributes();
    }
    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntityTypes.JPSPINO, JPSpinosaurusEntity.setAttributes());
    }
}
