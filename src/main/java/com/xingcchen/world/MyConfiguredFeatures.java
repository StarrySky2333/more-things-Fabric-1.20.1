package com.xingcchen.world;

import com.xingcchen.MoreThings;
import com.xingcchen.block.NewBlock;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class MyConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> CORN_ORE_KEY = registerKey("corn_ore");
    public static final RegistryKey<ConfiguredFeature<?,?>> DEEPSLATE_CORN_ORE_KEY = registerKey("deepslate_corn_ore");

    public static void boostrap(Registerable<ConfiguredFeature<?,?>> context){
        RuleTest stonePlace = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslatePlace = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);


        List<OreFeatureConfig.Target> overWorldUpper = List.of(
                OreFeatureConfig.createTarget(stonePlace, NewBlock.CORN_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overWorldLower = List.of(
                OreFeatureConfig.createTarget(deepslatePlace, NewBlock.DEEPSLATE_CORN_ORE.getDefaultState()));



        register(context,CORN_ORE_KEY,Feature.ORE,new OreFeatureConfig(overWorldUpper,5));
        register(context,DEEPSLATE_CORN_ORE_KEY,Feature.ORE,new OreFeatureConfig(overWorldLower,5));
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {

       return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,new Identifier(MoreThings.MOD_ID,name));
    }

    private static <FC extends FeatureConfig,F extends Feature<FC>> void register
            (Registerable<ConfiguredFeature<?,?>> context,RegistryKey<ConfiguredFeature<?, ?>> key,
             F feature, FC configuration){
        context.register(key,new ConfiguredFeature<>(feature,configuration));
    }

}
