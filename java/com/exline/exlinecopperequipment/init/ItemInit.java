package com.exline.exlinecopperequipment.init;

import com.exline.exlinecopperequipment.CopperEquipmentMain;
import com.exline.exlinecopperequipment.item.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
    //armor material
    public static final ArmorMaterial COPPER_ARMOR_MATERIAL = new CopperArmorMaterial();
    //nugget
    public static final Item COPPER_NUGGET = new Item(new Item.Settings());
    //sword
    public static ToolItem COPPER_SWORD = new SwordItem(CopperToolMaterial.INSTANCE, 0, -2.4F, new Item.Settings());
    //armor items
    public static final Item COPPER_HELMET = new ArmorItem(COPPER_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item COPPER_CHESTPLATE = new ArmorItem(COPPER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item COPPER_LEGGINGS = new ArmorItem(COPPER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item COPPER_BOOTS = new ArmorItem(COPPER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings());

    //tool items, tool material is registered elsewhere
    public static ToolItem COPPER_SHOVEL = new ShovelItem(CopperToolMaterial.INSTANCE, -1.5F, -3.0F, new Item.Settings());
    public static ToolItem COPPER_PICKAXE = new CopperPickaxeItem(CopperToolMaterial.INSTANCE, -2, -2.8F, new Item.Settings());
    public static ToolItem COPPER_AXE = new CopperAxeItem(CopperToolMaterial.INSTANCE, 3.5F, -3.1F, new Item.Settings());
    public static ToolItem COPPER_HOE = new CopperHoeItem(CopperToolMaterial.INSTANCE, -4.5F, -1F, new Item.Settings());
    //horse armor
    public static HorseArmorItem COPPER_HORSE_ARMOR = new HorseArmorItem(3,"copper",new Item.Settings());

    public static void registerItems(){
        registerItem(COPPER_NUGGET, "copper_nugget");

        registerItem(COPPER_SWORD, "copper_sword");

        registerItem(COPPER_HELMET, "copper_helmet");
        registerItem(COPPER_CHESTPLATE, "copper_chestplate");
        registerItem(COPPER_LEGGINGS, "copper_leggings");
        registerItem(COPPER_BOOTS, "copper_boots");

        registerItem(COPPER_SHOVEL, "copper_shovel");
        registerItem(COPPER_PICKAXE, "copper_pickaxe");
        registerItem(COPPER_AXE, "copper_axe");
        registerItem(COPPER_HOE, "copper_hoe");

        registerItem(COPPER_HORSE_ARMOR, "copper_horse_armor");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.add(COPPER_NUGGET);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(COPPER_SWORD);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(COPPER_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(COPPER_HELMET);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(COPPER_CHESTPLATE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(COPPER_LEGGINGS);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(COPPER_BOOTS);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(COPPER_SHOVEL);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(COPPER_PICKAXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(COPPER_AXE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.add(COPPER_HOE);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(COPPER_HORSE_ARMOR);});
    }

    //default register item
    public static void registerItem(Item item, String name){
        Registry.register(Registries.ITEM, new Identifier(CopperEquipmentMain.MOD_ID, name), item);
    }
}