package com.xingcchen.item.customItem;

import com.xingcchen.item.MyArmorMaterial;
import com.xingcchen.item.NewItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.include.com.google.common.collect.ImmutableMap;

import java.util.Map;

public class CustomArmor extends ArmorItem {
    public CustomArmor(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }



    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {

        if(!world.isClient()){
            if(entity instanceof PlayerEntity player && haveFullSuitArmor(player)){
                if(!player.hasStatusEffect(StatusEffects.GLOWING)){
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING,300,1,false,false,true));

                }
                if(!player.hasStatusEffect(StatusEffects.NIGHT_VISION)){
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,300,1,false,false,true));
                }
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private boolean haveFullSuitArmor(PlayerEntity player) {

        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        boolean isFullArmor = !(boots.isEmpty()&&leggings.isEmpty()&&chestplate.isEmpty()&&helmet.isEmpty());

        if (isFullArmor) {
            if(boots.isOf(NewItem.CORN_BOOTS) && leggings.isOf(NewItem.CORN_LEGGINGS) &&
                    chestplate.isOf(NewItem.CORN_CHESTPLATE) && helmet.isOf(NewItem.CORN_HELMET)){
                return true;
            }
        }
        return false;
    }


}
