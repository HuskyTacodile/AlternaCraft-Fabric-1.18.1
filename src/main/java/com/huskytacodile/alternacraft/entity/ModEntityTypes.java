package com.huskytacodile.alternacraft.entity;

import com.huskytacodile.alternacraft.AlternaCraft;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntityTypes {

    public static final EntityType<JPSpinosaurusEntity> JPSPINO = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(AlternaCraft.MOD_ID, "jpspino"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, JPSpinosaurusEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0f, 1.0f)).build());
}
