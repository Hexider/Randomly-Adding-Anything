package io.github.vampirestudios.raa.registries;

import io.github.vampirestudios.raa.RandomlyAddingAnything;
import io.github.vampirestudios.raa.api.enums.TextureTypes;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;

public class Textures {

    public static void init() {
        itemTextures();
        blockTextures();
    }

    private static void itemTextures() {
        for (int i = 1; i < 4; i++) {
            addTextureToList(TextureTypes.INGOT_TEXTURES, "item/ingots/ingot_" + i);
        }
        for (int i = 1; i < 10; i++) {
            addTextureToList(TextureTypes.GEM_ITEM_TEXTURES, "item/gems/gem_" + i);
        }
        for (int i = 1; i < 8; i++) {
            addTextureToList(TextureTypes.CRYSTAL_ITEM_TEXTURES, "item/crystals/crystal_" + i);
        }
        for (int i = 1; i < 7; i++) {
            addTextureToList(TextureTypes.METAL_NUGGET_TEXTURES, "item/nuggets/nugget_" + i);
        }
        addTextureToList(TextureTypes.METAL_NUGGET_TEXTURES, "item/special/infernal_iron_nugget");
        addTextureToList(TextureTypes.METAL_NUGGET_TEXTURES, "item/special/lumen_iron_nugget");
        addTextureToList(TextureTypes.METAL_NUGGET_TEXTURES, "item/special/radioactive_iron_nugget");
        addTextureToList(TextureTypes.METAL_NUGGET_TEXTURES, "item/special/super_iron_nugget");

        addTextureToList(TextureTypes.INGOT_TEXTURES, "item/special/infernal_iron_ingot");
        addTextureToList(TextureTypes.INGOT_TEXTURES, "item/special/lumen_iron_ingot");
        addTextureToList(TextureTypes.INGOT_TEXTURES, "item/special/radioactive_iron_ingot");
        addTextureToList(TextureTypes.INGOT_TEXTURES, "item/special/super_iron_ingot");

        for (int i = 1; i < 4; i++) {
            addTextureToList(TextureTypes.HELMET_TEXTURES, "item/armor/helmet_" + i);
        }
        for (int i = 1; i < 4; i++) {
            addTextureToList(TextureTypes.CHESTPLATE_TEXTURES, "item/armor/chestplate_" + i);
        }
        for (int i = 1; i < 4; i++) {
            addTextureToList(TextureTypes.LEGGINGS_TEXTURES, "item/armor/leggings_" + i);
        }
        for (int i = 1; i < 4; i++) {
            addTextureToList(TextureTypes.BOOTS_TEXTURES, "item/armor/boots_" + i);
        }

        addTextureToList(TextureTypes.HELMET_TEXTURES, "item/special/infernal_iron_helmet");
        addTextureToList(TextureTypes.HELMET_TEXTURES, "item/special/super_iron_helmet");

        addTextureToList(TextureTypes.CHESTPLATE_TEXTURES, "item/special/infernal_iron_chestplate");
        addTextureToList(TextureTypes.CHESTPLATE_TEXTURES, "item/special/super_iron_chestplate");

        addTextureToList(TextureTypes.LEGGINGS_TEXTURES, "item/special/infernal_iron_leggings");
        addTextureToList(TextureTypes.LEGGINGS_TEXTURES, "item/special/super_iron_leggings");

        addTextureToList(TextureTypes.BOOTS_TEXTURES, "item/special/infernal_iron_boots");
        addTextureToList(TextureTypes.BOOTS_TEXTURES, "item/special/super_iron_boots");

        addTextureToList(TextureTypes.HORSE_ARMOR_SADDLE_TEXTURES, "item/armor/horse_armor_saddle");
        addTextureToList(TextureTypes.HORSE_ARMOR_SADDLE_TEXTURES, "item/armor/horse_armor_saddle_2");

        TextureTypes.HORSE_ARMOR_MODEL_TEXTURES.add(new Identifier(RandomlyAddingAnything.MOD_ID, "textures/models/armor/horse/horse_armor_1.png"));
        TextureTypes.HORSE_ARMOR_MODEL_TEXTURES.add(new Identifier(RandomlyAddingAnything.MOD_ID, "textures/models/armor/horse/horse_armor_2.png"));
        TextureTypes.HORSE_ARMOR_MODEL_TEXTURES.add(new Identifier(RandomlyAddingAnything.MOD_ID, "textures/models/armor/horse/horse_armor_3.png"));
        TextureTypes.HORSE_ARMOR_MODEL_TEXTURES.add(new Identifier(RandomlyAddingAnything.MOD_ID, "textures/models/armor/horse/horse_armor_4.png"));

        addTexturesToMap(TextureTypes.HORSE_ARMOR, "item/armor/horse_armor_saddle",
                "textures/models/armor/horse/horse_armor_1.png");
        addTexturesToMap(TextureTypes.HORSE_ARMOR, "item/armor/horse_armor_saddle_2",
                "textures/models/armor/horse/horse_armor_2.png");

        addTexturesToMap(TextureTypes.AXES, "item/tools/axe/axe_head","item/tools/axe/axe_stick");
        addTexturesToMap(TextureTypes.AXES, "item/tools/axe/axe_head_2","item/tools/axe/axe_stick_2");
        addTexturesToMap(TextureTypes.AXES, "item/tools/axe/axe_head_3","item/tools/axe/axe_stick_3");
        addTexturesToMap(TextureTypes.AXES, "item/tools/axe/axe_head_4","item/tools/axe/axe_stick_4");

        addTexturesToMap(TextureTypes.PICKAXES, "item/tools/pickaxe/pickaxe_1","item/tools/pickaxe/pickaxe_1_handle");
        addTexturesToMap(TextureTypes.PICKAXES, "item/tools/pickaxe/pickaxe_2","item/tools/pickaxe/pickaxe_2_handle");
        addTexturesToMap(TextureTypes.PICKAXES, "item/tools/pickaxe/pickaxe_3","item/tools/pickaxe/pickaxe_3_handle");
        addTexturesToMap(TextureTypes.PICKAXES, "item/tools/pickaxe/pickaxe_4","item/tools/pickaxe/pickaxe_4_handle");
        addTexturesToMap(TextureTypes.PICKAXES, "item/tools/pickaxe/pickaxe_5","item/tools/pickaxe/pickaxe_5_handle");

        addTexturesToMap(TextureTypes.HOES, "item/tools/hoe/hoe_head_1","item/tools/hoe/hoe_stick_1");
        addTexturesToMap(TextureTypes.HOES, "item/tools/hoe/hoe_head_2","item/tools/hoe/hoe_stick_2");
        addTexturesToMap(TextureTypes.HOES, "item/tools/hoe/hoe_head_3","item/tools/hoe/hoe_stick_3");
        addTexturesToMap(TextureTypes.HOES, "item/tools/hoe/hoe_head_4","item/tools/hoe/hoe_stick_4");
        addTexturesToMap(TextureTypes.HOES, "item/tools/hoe/hoe_head_5","item/tools/hoe/hoe_stick_5");
    }

    private static void blockTextures() {
        for (int i = 1; i < 7; i++) {
            addTextureToList(TextureTypes.METAL_ORE_TEXTURES, "block/ores/metals/ore_" + i);
        }
        for (int i = 1; i < 5; i++) {
            addTextureToList(TextureTypes.GEM_ORE_TEXTURES, "block/ores/gems/ore_" + i);
        }
        for (int i = 1; i < 10; i++) {
            addTextureToList(TextureTypes.CRYSTAL_ORE_TEXTURES, "block/ores/crystals/ore_" + i);
        }
        addTextureToList(TextureTypes.GEM_ORE_TEXTURES, "block/ores/archaic_ore");
        addTextureToList(TextureTypes.GEM_ORE_TEXTURES, "block/ores/dark_pearl_ore");
        addTextureToList(TextureTypes.GEM_ORE_TEXTURES, "block/ores/ebonite_ore");
        addTextureToList(TextureTypes.METAL_ORE_TEXTURES, "block/ores/infernal_iron_ore_glow");
        addTextureToList(TextureTypes.GEM_ORE_TEXTURES, "block/ores/lumen_iron_ore_glow");
        addTextureToList(TextureTypes.GEM_ORE_TEXTURES, "block/ores/nagrilite_ore");
        addTextureToList(TextureTypes.CRYSTAL_ORE_TEXTURES, "block/ores/radioactive_iron_ore_glow");
        addTextureToList(TextureTypes.METAL_ORE_TEXTURES, "block/ores/super_iron_ore");
        addTextureToList(TextureTypes.GEM_ORE_TEXTURES, "block/ores/tenebrum_ore");

        for (int i = 1; i < 5; i++) {
            addTextureToList(TextureTypes.METAL_BLOCK_TEXTURES, "block/storage_blocks/metals/metal_" + i);
        }
        for (int i = 1; i < 5; i++) {
            addTextureToList(TextureTypes.GEM_BLOCK_TEXTURES, "block/storage_blocks/gems/gem_" + i);
        }
        addTextureToList(TextureTypes.CRYSTAL_BLOCK_TEXTURES, "block/storage_blocks/crystals/crystal_1");

        addTextureToList(TextureTypes.GEM_BLOCK_TEXTURES, "block/storage_blocks/dark_pearl_block");
        addTextureToList(TextureTypes.GEM_BLOCK_TEXTURES, "block/storage_blocks/ebonite_block");
        addTextureToList(TextureTypes.METAL_BLOCK_TEXTURES, "block/storage_blocks/infernal_iron_block");
        addTextureToList(TextureTypes.GEM_BLOCK_TEXTURES, "block/storage_blocks/lumen_iron_block");
        addTextureToList(TextureTypes.GEM_BLOCK_TEXTURES, "block/storage_blocks/nagrilite_block");
        addTextureToList(TextureTypes.CRYSTAL_BLOCK_TEXTURES, "block/storage_blocks/radioactive_iron_block");
        addTextureToList(TextureTypes.METAL_BLOCK_TEXTURES, "block/storage_blocks/super_iron_block");
        addTextureToList(TextureTypes.GEM_BLOCK_TEXTURES, "block/storage_blocks/tenebrum_block");
    }

    private static void addTextureToList(List<Identifier> textures, String name) {
        textures.add(new Identifier(RandomlyAddingAnything.MOD_ID, name));
    }

    private static void addTexturesToMap(Map<Identifier, Identifier> textureSets, String texture1, String texture2) {
        textureSets.put(
                new Identifier(RandomlyAddingAnything.MOD_ID, texture1),
                new Identifier(RandomlyAddingAnything.MOD_ID, texture2)
        );
    }

}
