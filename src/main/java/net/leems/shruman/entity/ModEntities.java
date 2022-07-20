package net.leems.shruman.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.leems.shruman.Shruman;
import net.leems.shruman.entity.custom.ShrumanEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<ShrumanEntity> SHRUMAN = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Shruman.MOD_ID, "shruman"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ShrumanEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 1.3f)).build());
}
