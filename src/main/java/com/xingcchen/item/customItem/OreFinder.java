package com.xingcchen.item.customItem;

import com.xingcchen.block.NewBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class OreFinder extends Item {
    public OreFinder(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        if(!context.getWorld().isClient){
            BlockPos bp = context.getBlockPos();
            PlayerEntity pe = context.getPlayer();
            boolean isFound = false;
            int n;


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
        return bs.isOf(NewBlock.CORN_ORE)||bs.isOf(Blocks.DIAMOND_ORE);
    }
}
