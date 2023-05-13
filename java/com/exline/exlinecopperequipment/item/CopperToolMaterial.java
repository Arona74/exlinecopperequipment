package com.exline.exlinecopperequipment.item;

import com.exline.exlinecopperequipment.CopperEquipmentMain;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CopperToolMaterial implements ToolMaterial {
    public static final CopperToolMaterial INSTANCE = new CopperToolMaterial();

    @Override
    public int getDurability(){
        return 190;
    }

    @Override
    public float getMiningSpeedMultiplier(){
        return 5.0f;
    }

    @Override
    public float getAttackDamage(){
        return 4.5f;
    }

    @Override
    public int getMiningLevel(){
        return 1;
    }

    @Override
    public int getEnchantability(){
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient(){
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }

    // For LevelZ compat
    @Override
    public String toString() {
        return CopperEquipmentMain.MOD_ID + ":" + "COPPER";
    }
}