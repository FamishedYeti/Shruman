package net.leems.shruman.entity.client;

import net.leems.shruman.Shruman;
import net.leems.shruman.entity.custom.ShrumanEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ShrumanRenderer extends GeoEntityRenderer<ShrumanEntity> {
    public ShrumanRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new ShrumanModel());
    }

    @Override
    public Identifier getTextureResource(ShrumanEntity instance) {
        return new Identifier(Shruman.MOD_ID, "textures/entity/shruman/shruman.png");
    }

}
