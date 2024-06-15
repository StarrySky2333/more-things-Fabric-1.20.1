package com.xingcchen.item;

import com.xingcchen.MoreThings;
import com.xingcchen.block.NewBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MyRegister {

    /*registry - 你需要将内容添加到的注册表的实例。
    位于Registry中的所有原版注册表的列表，可以在注册表类型页面中找到。
    id - 注册表内，你的内容的一个标识符。标准的格式为模组ID:名称，就像minecraft:dirt这样。
    entry - 你需要注册的内容的实例。*/

    //Registry.register(Registries.ITEM, new Identifier("tutorial", "custom_item"), CUSTOM_ITEM);

    public static void registeritem(){
        Registry.register(Registries.ITEM,new Identifier(MoreThings.MOD_ID,"corn_ingot"),NewItem.CORN_INGOT);
        Registry.register(Registries.ITEM,new Identifier(MoreThings.MOD_ID,"corn_ore"),NewItem.CORN_ORE);
        Registry.register(Registries.ITEM,new Identifier(MoreThings.MOD_ID,"raw_corn"),NewItem.RAW_CORN);
        Registry.register(Registries.ITEM,new Identifier(MoreThings.MOD_ID,"corn_block"),NewItem.CORN_BLOCK);

        Registry.register(Registries.ITEM,new Identifier(MoreThings.MOD_ID,"corn_sword"),NewItem.CORN_SWORD);
        Registry.register(Registries.ITEM,new Identifier(MoreThings.MOD_ID,"corn_shovel"),NewItem.CORN_SHOVEL);
        Registry.register(Registries.ITEM,new Identifier(MoreThings.MOD_ID,"corn_pickaxe"),NewItem.CORN_PICKAXE);
        Registry.register(Registries.ITEM,new Identifier(MoreThings.MOD_ID,"corn_axe"),NewItem.CORN_AXE);
        Registry.register(Registries.ITEM,new Identifier(MoreThings.MOD_ID,"corn_hoe"),NewItem.CORN_HOE);

        Registry.register(Registries.ITEM,new Identifier(MoreThings.MOD_ID,"corn_helmet"),NewItem.CORN_HELMET);
        Registry.register(Registries.ITEM,new Identifier(MoreThings.MOD_ID,"corn_chestplate"),NewItem.CORN_CHESTPLATE);
        Registry.register(Registries.ITEM,new Identifier(MoreThings.MOD_ID,"corn_leggings"),NewItem.CORN_LEGGINGS);
        Registry.register(Registries.ITEM,new Identifier(MoreThings.MOD_ID,"corn_boots"),NewItem.CORN_BOOTS);

        Registry.register(Registries.ITEM,new Identifier(MoreThings.MOD_ID,"ore_finder"),NewItem.ORE_FINDER);



    }

    public static void registerblock(){
        Registry.register(Registries.BLOCK,new Identifier(MoreThings.MOD_ID,"corn_ore"), NewBlock.CORN_ORE);
        Registry.register(Registries.BLOCK,new Identifier(MoreThings.MOD_ID,"corn_block"), NewBlock.CORN_BLOCK);
    }

    public static void registeritemgroup(){
        Registry.register(Registries.ITEM_GROUP, new Identifier(MoreThings.MOD_ID, "group"),MyItemGroup.ITEM_GROUP);

    }



}
