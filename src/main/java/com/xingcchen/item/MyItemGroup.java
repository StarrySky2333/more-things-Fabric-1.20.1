package com.xingcchen.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

public class MyItemGroup {

    /*添加物品组
    首先，先决定需要将物品添加到哪个物品组。例如，添加到建筑方块物品组。原版物品组存储在 ItemGroups 类中。
    然后，在你的 onInitialize 方法中，为这个物品组添加事件处理器。每个需要修改的物品组都需要一个自己的监听器，
    但可以使用同一个监听器来将多个物品添加到同一个物品组中。

    //添加物品到原版物品组中
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
	content.add(CUSTOM_ITEM);
    });*/


    /*这个 modification event 也能够进行更加精细化的控制，例如将你的自定义物品放在特定的位置
    （例如，在 OAK_DOOR 的后面）或者其他的高级修改。每个你需要修改的物品组都需要自己的事件处理器，
    当然，同一个事件处理器可以用于给一个物品组添加多个物品。
    物品可以添加到一个相对于原版物品的位置。仔细思考你的模组的用户会期望物品出现在哪里。
    例如，如果你添加一种新的类型的木头，那么将其添加到已有木头的后面或许是最合理的。
    例如，以下这个事件监听器会将你的模组中的物品放在建筑方块物品组中的橡木门后面：
    //自定义添加物品在物品组中的位置
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
	content.addAfter(Items.OAK_DOOR, CUSTOM_ITEM);
    });*/



    //使用 FabricItemGroup.builder 方法来创建物品组的构建器，并调用 build 方法来完成：
    //在 entries 方法中，将物品添加到你的物品组中
    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(NewItem.CORN_INGOT))
            .displayName(Text.translatable("itemGroup.more-things.allthingsgroup"))
            .entries((context, entries) -> {
                entries.add(NewItem.CORN_INGOT);
                entries.add(NewItem.RAW_CORN);
                entries.add(NewItem.CORN_ORE);
                entries.add(NewItem.CORN_BLOCK);
                entries.add(NewItem.CORN_SWORD);
                entries.add(NewItem.CORN_SHOVEL);
                entries.add(NewItem.CORN_PICKAXE);
                entries.add(NewItem.CORN_AXE);
                entries.add(NewItem.CORN_HOE);
                entries.add(NewItem.CORN_HELMET);
                entries.add(NewItem.CORN_CHESTPLATE);
                entries.add(NewItem.CORN_LEGGINGS);
                entries.add(NewItem.CORN_BOOTS);
            })
            .build();


}
