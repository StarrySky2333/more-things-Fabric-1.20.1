package com.xingcchen.item;

import com.xingcchen.block.NewBlock;
import com.xingcchen.item.customItem.CustomArmor;
import com.xingcchen.item.customItem.OreFinder;
import net.minecraft.item.*;


public class NewItem {
    //物品实例
    /*首先，创建一个 Item 的实例，存储为静态常量字段。
    Item 的构造方法接受一个 Item.Settings（或 FabricItemSettings，
    除非是 1.20.5 以上版本）对象，该对象用于设置物品属性，例如耐久和堆叠数量。*/


    //通过Settings()方法设置一些物品的基本属性，如果需要进一步自定义一类物品则需要重写一个新的物品类
    public static final Item RAW_CORN = new Item(new Item.Settings());
    public static final Item CORN_INGOT = new Item(new Item.Settings());
    //创建方块物品<-NewBlock
    public static final Item CORN_ORE = new BlockItem(NewBlock.CORN_ORE, new Item.Settings());
    public static final Item CORN_BLOCK = new BlockItem(NewBlock.CORN_BLOCK,new Item.Settings());

    //创建一些工具->corn类
    public static final ToolItem CORN_SWORD = new SwordItem(MyToolMaterial.CORN, 5, 1, new Item.Settings().fireproof());
    public static final ToolItem CORN_SHOVEL = new ShovelItem(MyToolMaterial.CORN, 2, 2, new Item.Settings().fireproof());
    public static final ToolItem CORN_PICKAXE = new PickaxeItem(MyToolMaterial.CORN, 3, -0.1F, new Item.Settings().fireproof());
    public static final ToolItem CORN_AXE = new AxeItem(MyToolMaterial.CORN, 8, -0.9F, new Item.Settings().fireproof());
    public static final ToolItem CORN_HOE = new HoeItem(MyToolMaterial.CORN, 1, 0, new Item.Settings().fireproof());
    //创建一些盔甲->corn类
    public static final ArmorItem CORN_HELMET =new CustomArmor(MyArmorMaterial.CORN_INGOT, ArmorItem.Type.HELMET,new Item.Settings().fireproof());
    public static final ArmorItem CORN_CHESTPLATE =new ArmorItem(MyArmorMaterial.CORN_INGOT, ArmorItem.Type.CHESTPLATE,new Item.Settings().fireproof());
    public static final ArmorItem CORN_LEGGINGS =new ArmorItem(MyArmorMaterial.CORN_INGOT, ArmorItem.Type.LEGGINGS,new Item.Settings().fireproof());
    public static final ArmorItem CORN_BOOTS =new ArmorItem(MyArmorMaterial.CORN_INGOT, ArmorItem.Type.BOOTS,new Item.Settings().fireproof());

    //创建自定义实用工具
    public static final Item ORE_FINDER = new OreFinder(new Item.Settings().maxCount(1).maxDamage(63));

    //创建杂项物品
    /*这里使用原版注册方式来注册，基本语法是 Registry#register(注册表类型, ID, 内容)，
    注册表类型是存储在 Registries 或 Registry 类中的静态字段，标识符用来给内容“加标签”。
    内容则是您添加的东西的一个实例。这可以随时调用，只要发生在初始化阶段。*/

    //Registry.register(Registries.ITEM, new Identifier("tutorial", "custom_item"), CUSTOM_ITEM);

    //简化代码，创建物品的同时对物品进行注册

    /*
    public static final Item CUSTOM_ITEM =
      Registry.register(Registries.ITEM, new Identifier("tutorial", "custom_item"),
      new Item(new Item.Settings()));
    */
}
