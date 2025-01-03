package net.dinglezz.deepoverworld.item.custom;

import net.dinglezz.deepoverworld.effect.ModEffects;
import net.dinglezz.deepoverworld.enchantment.ModEnchantments;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;

public class GrasinCItem extends Item {
    public GrasinCItem(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof ServerPlayerEntity player) {

            ItemStack helmetStack = player.getInventory().armor.get(3);
            Registry<Enchantment> enchantmentRegistry = world.getRegistryManager().get(RegistryKeys.ENCHANTMENT);
            RegistryEntry.Reference<Enchantment> enchantmentReference = enchantmentRegistry.getEntry(ModEnchantments.GRASIN_PROTECTION).orElseThrow();
            boolean hasEnchantment = EnchantmentHelper.getLevel(enchantmentReference, helmetStack) > 2;

            if (!hasEnchantment) {
                player.addStatusEffect(new StatusEffectInstance(ModEffects.GRASIN_POISONING_TRES, 1800, 2));
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
