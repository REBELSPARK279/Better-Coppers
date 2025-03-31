package net.rebelspark.bettercopper.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.rebelspark.bettercopper.BetterCopper;
import net.rebelspark.bettercopper.util.ModTags;

import java.util.List;

public class ModToolTiers {

    public static final Tier COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(1,175,3.0f,0.5f,4,
                    ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(BetterCopper.MOD_ID, "copper"), List.of(Tiers.STONE), List.of());

}
//List.of is the lesser tier. in titanium List.of(Tiers.IRON)  means iron is lesser then titanium
//level 0 -> wood gold 1 -> stone 2 -> iron 3 -> diamond 4 -> netherite
