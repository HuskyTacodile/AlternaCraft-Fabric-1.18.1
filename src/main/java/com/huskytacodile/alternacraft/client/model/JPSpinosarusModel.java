package com.huskytacodile.alternacraft.client.model;

import com.huskytacodile.alternacraft.AlternaCraft;
import com.huskytacodile.alternacraft.client.render.JPSpinosaurusRenderer;
import com.huskytacodile.alternacraft.entity.JPSpinosaurusEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class JPSpinosarusModel extends AnimatedGeoModel<JPSpinosaurusEntity> {
    @Override
    public Identifier getModelResource(JPSpinosaurusEntity entity) {
        return new Identifier(AlternaCraft.MOD_ID, "geo/jpspino.geo.json");
    }

    @Override
    public Identifier getTextureResource(JPSpinosaurusEntity entity) {
        return JPSpinosaurusRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public Identifier getAnimationResource(JPSpinosaurusEntity entity) {
        return new Identifier(AlternaCraft.MOD_ID, "animations/jpspino.animation.json");
    }
}