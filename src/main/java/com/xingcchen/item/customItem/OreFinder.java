package com.xingcchen.item.customItem;

import com.xingcchen.block.NewBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class OreFinder extends Item {
    public OreFinder(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.tutorial.ore_finder.tooltip").formatted(Formatting.AQUA));
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        if(!context.getWorld().isClient){
            BlockPos bp = context.getBlockPos();
            PlayerEntity pe = context.getPlayer();
            boolean isFound = false;


            for (int i = bp.getY(); i >= -64; i--) {

                BlockState bs = context.getWorld().getBlockState(new BlockPos(bp.getX(), i, bp.getZ()));

                if(isRightBlock(bs)){
                    outputMessage(new BlockPos(bp.getX(), i, bp.getZ()),pe,bs.getBlock());
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                pe.sendMessage(Text.literal("Not found anything!"));
            }

        }

        context.getStack().damage(1,context.getPlayer(),
                playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        return ActionResult.SUCCESS;
    }

    private void outputMessage(BlockPos bp, PlayerEntity pe, Block block) {
        pe.sendMessage(Text.literal("找到一个"+block.asItem().getName().getString()+"在"+bp.getX()+","+bp.getY()+","+bp.getZ()),false);
    }


    private boolean isRightBlock(BlockState bs) {
        return bs.isOf(NewBlock.CORN_ORE);
    }
}
