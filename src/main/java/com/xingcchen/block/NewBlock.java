package com.xingcchen.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.Item;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class NewBlock {
    //创建方块
    public static final Block CORN_ORE = new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE), UniformIntProvider.create(2,5));
    public static final Block CORN_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK));

}
