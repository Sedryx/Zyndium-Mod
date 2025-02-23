package ch.sedryx.zyndiummod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.ArrayList;
import java.util.List;

public class HammerItem extends MiningToolItem {
    private final int range;
    private final int range2;

    public HammerItem(ToolMaterial material, float attackDamage, float attackSpeed, TagKey<Block> effectiveBlocks, int range, int range2, Settings settings) {
        super(attackDamage, attackSpeed, material, BlockTags.PICKAXE_MINEABLE, settings);
        this.range = range;
        this.range2 = range2 -1;
    }

    public List<BlockPos> getBlocksToBeDestroyed(BlockPos initalBlockPos, ServerPlayerEntity player) {
        List<BlockPos> positions = new ArrayList<>();
        HitResult hit = player.raycast(100, 0, false);
        if (hit.getType() == HitResult.Type.BLOCK) {
            BlockHitResult blockHit = (BlockHitResult) hit;

            if(blockHit.getSide() == Direction.DOWN || blockHit.getSide() == Direction.UP) {
                for(int x = -range; x <= range; x++) {
                    for(int y = -range; y <= range; y++) {
                        for (int z = -range2; z <= range2; z++) {
                            positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY() + z, initalBlockPos.getZ() + y));
                        }
                    }
                }
            }

            if(blockHit.getSide() == Direction.NORTH || blockHit.getSide() == Direction.SOUTH) {
                for(int x = -range; x <= range; x++) {
                    for(int y = -range; y <= range; y++) {
                        for (int z = -range2; z <= range2; z++) {
                            positions.add(new BlockPos(initalBlockPos.getX() + x, initalBlockPos.getY() + y, initalBlockPos.getZ() + z));
                        }
                    }
                }
            }

            if(blockHit.getSide() == Direction.EAST || blockHit.getSide() == Direction.WEST) {
                for(int x = -range; x <= range; x++) {
                    for(int y = -range; y <= range; y++) {
                        for (int z = -range2; z <= range2; z++) {
                            positions.add(new BlockPos(initalBlockPos.getX() + z, initalBlockPos.getY() + y, initalBlockPos.getZ() + x));
                        }
                    }
                }
            }
        }

        return positions;
    }

}