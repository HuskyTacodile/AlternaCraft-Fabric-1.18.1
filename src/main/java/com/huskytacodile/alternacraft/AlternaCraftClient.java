package com.huskytacodile.alternacraft;

import com.huskytacodile.alternacraft.client.render.JPSpinosaurusRenderer;
import com.huskytacodile.alternacraft.entity.ModEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class AlternaCraftClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntityTypes.JPSPINO, JPSpinosaurusRenderer::new);
    }

}
