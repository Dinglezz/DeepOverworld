package net.dinglezz.deepoverworld.util;

import net.dinglezz.deepoverworld.DeepOverworld;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

       public static TagKey<Block> IS_DEEP_PLANTABLE = createTag("is_deep_plantable");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(DeepOverworld.MOD_ID, name));
        }
    }

    public static class Items {
       // public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(DeepOverworld.MOD_ID, name));
        }
    }
}
