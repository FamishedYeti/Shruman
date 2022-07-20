package net.leems.shruman.entity.client;

import net.leems.shruman.Shruman;
import net.leems.shruman.entity.custom.ShrumanEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class ShrumanModel extends AnimatedGeoModel<ShrumanEntity> {
    @Override
    public Identifier getModelResource(ShrumanEntity object) {
        return new Identifier(Shruman.MOD_ID, "geo/shruman.geo.json");
    }

    @Override
    public Identifier getTextureResource(ShrumanEntity object) {
        return new Identifier(Shruman.MOD_ID, "textures/entity/shruman/shruman.png");
    }

    @Override
    public Identifier getAnimationResource(ShrumanEntity animatable) {
        return new Identifier(Shruman.MOD_ID, "animations/shruman.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(ShrumanEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("h_head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
