package com.github.charlyb01.sihywtcamc;

import com.github.charlyb01.sihywtcamc.config.ModConfig;
import com.github.charlyb01.sihywtcamc.mixin.ItemAccessor;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
import me.sargunvohra.mcmods.autoconfig1u.serializer.PartitioningSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Items;

public class Sihywtcamc implements ModInitializer {
    @Override
    public void onInitialize() {
        AutoConfig.register(ModConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));

        ((ItemAccessor) Items.POTION).setMaxCount(16);
        ((ItemAccessor) Items.MILK_BUCKET).setMaxCount(16);
        ((ItemAccessor) Items.SNOWBALL).setMaxCount(64);
    }
}
