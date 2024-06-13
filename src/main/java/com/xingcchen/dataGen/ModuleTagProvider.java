package com.xingcchen.dataGen;

import com.xingcchen.block.NewBlock;
import com.xingcchen.item.NewItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;



public class ModuleTagProvider extends FabricModelProvider {
    public ModuleTagProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(NewBlock.CORN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(NewBlock.CORN_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(NewItem.CORN_INGOT, Models.GENERATED);
        itemModelGenerator.register(NewItem.RAW_CORN, Models.GENERATED);


        itemModelGenerator.register(NewItem.CORN_AXE, Models.HANDHELD);
        itemModelGenerator.register(NewItem.CORN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(NewItem.CORN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(NewItem.CORN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(NewItem.CORN_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(NewItem.CORN_HELMET);
        itemModelGenerator.registerArmor(NewItem.CORN_CHESTPLATE);
        itemModelGenerator.registerArmor(NewItem.CORN_LEGGINGS);
        itemModelGenerator.registerArmor(NewItem.CORN_BOOTS);

        itemModelGenerator.register(NewItem.ORE_FINDER, Models.GENERATED);


    }
}
