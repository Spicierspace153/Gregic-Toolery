package com.juiceybeans.toolery.common.data;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.Table;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.item.IGTTool;
import com.gregtechceu.gtceu.api.item.armor.ArmorComponentItem;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gregtechceu.gtceu.common.item.armor.GTArmorMaterials;
import com.juiceybeans.toolery.api.item.armor.VanillaArmorLogic;
import com.tterrag.registrate.providers.ProviderType;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.tterrag.registrate.util.entry.ItemProviderEntry;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;
import net.minecraft.Util;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.common.Tags;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import static com.juiceybeans.toolery.Toolery.LOGGER;
import static com.juiceybeans.toolery.Toolery.TOOLERY_REGISTRATE;

public class TooleryItems {
    public static ItemEntry<ArmorComponentItem> TEST_CHESTPLATE = TOOLERY_REGISTRATE
            .item("test_chestplate",
                    (p) -> new ArmorComponentItem(GTArmorMaterials.ARMOR, ArmorItem.Type.CHESTPLATE, p)
                            .setArmorLogic(new VanillaArmorLogic(ArmorItem.Type.CHESTPLATE,"test")))
            .lang("Test Chestplate")
            .properties(p -> p.rarity(Rarity.UNCOMMON))
            .tag(Tags.Items.ARMORS_CHESTPLATES)
            .register();

    public static ItemEntry<ArmorComponentItem> TEST_BOOTS = TOOLERY_REGISTRATE
            .item("test_boots",
                    (p) -> new ArmorComponentItem(GTArmorMaterials.ARMOR, ArmorItem.Type.BOOTS, p)
                            .setArmorLogic(new VanillaArmorLogic(ArmorItem.Type.BOOTS,"test")))
            .lang("Test Boots")
            .properties(p -> p.rarity(Rarity.UNCOMMON))
            .tag(Tags.Items.ARMORS_BOOTS)
            .register();

    public static ItemEntry<ArmorComponentItem> TEST_LEGGINGS = TOOLERY_REGISTRATE
            .item("test_leggings",
                    (p) -> new ArmorComponentItem(GTArmorMaterials.ARMOR, ArmorItem.Type.LEGGINGS, p)
                            .setArmorLogic(new VanillaArmorLogic(ArmorItem.Type.LEGGINGS,"test")))
            .lang("Test Leggings")
            .properties(p -> p.rarity(Rarity.UNCOMMON))
            .tag(Tags.Items.ARMORS_LEGGINGS)
            .register();

    public static ItemEntry<ArmorComponentItem> TEST_HELMET = TOOLERY_REGISTRATE
            .item("test_helmet",
                    (p) -> new ArmorComponentItem(GTArmorMaterials.ARMOR, ArmorItem.Type.HELMET, p)
                            .setArmorLogic(new VanillaArmorLogic(ArmorItem.Type.HELMET,"test")))
            .lang("Test Helmet")
            .properties(p -> p.rarity(Rarity.UNCOMMON))
            .tag(Tags.Items.ARMORS_HELMETS)
            .register();

    public static void init() {
    }
}
