package net.dinglezz.deepoverworld.util;

import net.dinglezz.deepoverworld.DeepOverworld;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

       public static TagKey<Block> DEEP_VEGETATION = createTag("deep_vegatation");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(DeepOverworld.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(DeepOverworld.MOD_ID, name));
        }
    }
}
