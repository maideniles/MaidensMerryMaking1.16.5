package com.maideniles.maidensmerrymaking.items;

import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;


public class MintBottleItem extends Item {
    public MintBottleItem(Item.Properties builder) {
        super(builder);
    }

    /**
     * Called to trigger the item's "innate" right click behavior. To handle when this item is used on a Block, see
     * {@link #onItemUse}.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        ItemStack itemstack = playerIn.getHeldItem(handIn);


            RayTraceResult raytraceresult = rayTrace(worldIn, playerIn, RayTraceContext.FluidMode.SOURCE_ONLY);
            if (raytraceresult.getType() == RayTraceResult.Type.MISS) {
                return ActionResult.resultPass(itemstack);
            } else {
                if (raytraceresult.getType() == RayTraceResult.Type.BLOCK) {
                    BlockPos blockpos = ((BlockRayTraceResult)raytraceresult).getPos();
                    if (!worldIn.isBlockModifiable(playerIn, blockpos)) {
                        return ActionResult.resultPass(itemstack);
                    }

                    if (worldIn.getFluidState(blockpos).isTagged(FluidTags.WATER)) {
                        worldIn.playSound(playerIn, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.NEUTRAL, 1.0F, 1.0F);
                        return ActionResult.func_233538_a_(this.turnBottleIntoItem(itemstack, playerIn, (new ItemStack(ModItems.PEPPERMINT_EXTRACT.get()))), worldIn.isRemote());
                    }
                }

                return ActionResult.resultPass(itemstack);
            }
        }


    protected ItemStack turnBottleIntoItem(ItemStack bottleStack, PlayerEntity player, ItemStack stack) {
        player.addStat(Stats.ITEM_USED.get(this));
        return DrinkHelper.fill(bottleStack, player, stack);
    }
}