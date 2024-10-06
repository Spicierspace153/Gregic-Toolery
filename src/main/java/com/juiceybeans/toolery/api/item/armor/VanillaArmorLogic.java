package com.juiceybeans.toolery.api.item.armor;

import com.gregtechceu.gtceu.api.item.armor.IArmorLogic;
import com.juiceybeans.toolery.Toolery;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class VanillaArmorLogic implements IArmorLogic {
    private final ArmorItem.Type type;
    private final String armorTexture;

    public VanillaArmorLogic(ArmorItem.Type type, String armorTexture) {
        this.type = type;
        this.armorTexture = armorTexture;
    }

    @Override
    public ArmorItem.Type getArmorType() {
        return this.type;
    }

    @Override
    public int getArmorDisplay(Player player, @NotNull ItemStack armor, EquipmentSlot slot) {
        return 0;
    }

    @Override
    public @Nullable ResourceLocation getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return slot != EquipmentSlot.LEGS ?
                Toolery.id(String.format("textures/armor/%s_1.png", armorTexture)) :
                Toolery.id(String.format("textures/armor/%s_2.png", armorTexture));
    }
}
