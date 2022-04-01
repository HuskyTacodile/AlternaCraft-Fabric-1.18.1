package com.huskytacodile.alternacraft.client.render;

import com.google.common.collect.Maps;
import com.huskytacodile.alternacraft.AlternaCraft;
import com.huskytacodile.alternacraft.client.model.JPSpinosarusModel;
import com.huskytacodile.alternacraft.entity.JPSpinosaurusEntity;
import com.huskytacodile.alternacraft.entity.variant.GenderVariant;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class JPSpinosaurusRenderer extends GeoEntityRenderer<JPSpinosaurusEntity> {
    public static final Map<GenderVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(GenderVariant.class), (map) -> {
                map.put(GenderVariant.MALE,
                        new Identifier(AlternaCraft.MOD_ID, "textures/entity/jpmalespino.png"));
                map.put(GenderVariant.FEMALE,
                        new Identifier(AlternaCraft.MOD_ID, "textures/entity/jpfemalespino.png"));
            });

    public JPSpinosaurusRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new JPSpinosarusModel());
    }
    @Override
    public Identifier getTextureResource(JPSpinosaurusEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }
}
