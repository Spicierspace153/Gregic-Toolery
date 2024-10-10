package com.juiceybeans.toolery.common.data;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.Table;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.gregtechceu.gtceu.api.item.IGTTool;
import com.gregtechceu.gtceu.api.item.armor.ArmorComponentItem;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gregtechceu.gtceu.common.item.armor.GTArmorMaterials;
import com.juiceybeans.toolery.Toolery;
import com.juiceybeans.toolery.api.item.armor.VanillaArmorLogic;
import com.tterrag.registrate.providers.ProviderType;
import com.tterrag.registrate.util.entry.ItemProviderEntry;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;
import net.minecraft.Util;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Items;

import java.util.EnumMap;
import java.util.Map;

public class PostMaterialEventStuffGuh {

    public static void init() {
        generateArmors();
    }
    public final static EnumMap<ArmorItem.Type, Integer> armorMap = Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 1);
        map.put(ArmorItem.Type.LEGGINGS, 2);
        map.put(ArmorItem.Type.CHESTPLATE, 3);
        map.put(ArmorItem.Type.HELMET, 1);
    });

    public final static Table<Material, ArmorItem.Type, ItemProviderEntry<ArmorComponentItem>> ARMOR_ITEMS = ArrayTable.create(
            GTCEuAPI.materialManager.getRegisteredMaterials().stream().filter(mat -> mat.hasProperty(PropertyKey.TOOL))
                    .toList(), armorMap.keySet().stream().toList());

    public static void generateArmors() {
        for (Map.Entry<ArmorItem.Type, Integer> armorType : armorMap.entrySet()) {
            for (MaterialRegistry registry : GTCEuAPI.materialManager.getRegistries()) {
                GTRegistrate registrate = Toolery.TOOLERY_REGISTRATE;
                for (Material material : registry.getAllMaterials()) {
                    if (material.hasProperty(PropertyKey.TOOL)) {
                        var property = material.getProperty(PropertyKey.TOOL);
                        var tier = material.getToolTier();
                        String wuh = tier.material.getName() + "_" + armorType.getKey().toString().toLowerCase();

                        ARMOR_ITEMS.put(material, armorType.getKey(), (ItemProviderEntry<ArmorComponentItem>) (ItemProviderEntry<?>)
                                registrate
                                        .item(wuh,
                                                p -> new ArmorComponentItem(GTArmorMaterials.ARMOR, armorType.getKey(), p)
                                                        .setArmorLogic(new VanillaArmorLogic(armorType.getKey(), wuh)))
                                        .properties(p -> p.craftRemainder(Items.AIR))
                                        .setData(ProviderType.LANG, NonNullBiConsumer.noop())
                                        .model(NonNullBiConsumer.noop())
                                        .color(() -> IGTTool::tintColor)
                                        .register());
                    }
                }
            }
        }
    }
}
