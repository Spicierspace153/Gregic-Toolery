package com.juiceybeans.toolery.common.data;

import com.gregtechceu.gtceu.api.item.armor.ArmorComponentItem;
import com.gregtechceu.gtceu.common.item.armor.GTArmorMaterials;
import com.juiceybeans.toolery.api.item.armor.VanillaArmorLogic;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.common.Tags;

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
