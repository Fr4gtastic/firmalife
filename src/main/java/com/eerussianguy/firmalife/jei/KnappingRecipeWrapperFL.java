/*
 * Work under Copyright. Licensed under the EUPL.
 * See the project README.md and LICENSE.txt for more information.
 */

package com.eerussianguy.firmalife.jei;

import javax.annotation.ParametersAreNonnullByDefault;

import com.eerussianguy.firmalife.util.KnappingFL;
import com.google.common.collect.ImmutableMap;
import net.dries007.tfc.compat.jei.wrappers.KnappingRecipeWrapper;
import net.minecraft.util.ResourceLocation;

import mezz.jei.api.IGuiHelper;
import net.dries007.tfc.api.recipes.knapping.KnappingRecipe;
import net.dries007.tfc.api.recipes.knapping.KnappingType;

import java.util.Map;

@ParametersAreNonnullByDefault
public class KnappingRecipeWrapperFL extends KnappingRecipeWrapper
{
    public static final ResourceLocation PUMPKIN_TEXTURE = new ResourceLocation("minecraft","textures/blocks/pumpkin_side.png");

    public static final Map<KnappingType, ResourceLocation> HIGHMAP = ImmutableMap.of(KnappingFL.PUMPKIN, PUMPKIN_TEXTURE);

    public static final Map<KnappingType, ResourceLocation> LOWMAP = ImmutableMap.of();

    public KnappingRecipeWrapperFL(KnappingRecipe recipe, IGuiHelper guiHelper)
    {
        super(recipe, guiHelper, HIGHMAP.get(recipe.getType()), LOWMAP.get(recipe.getType()));
    }
}