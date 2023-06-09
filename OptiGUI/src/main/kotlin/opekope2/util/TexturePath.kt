@file: JvmName("ContainerTexturePath")

package opekope2.util

import net.minecraft.util.Identifier

/**
 * Texture paths for Minecraft containers.
 */
object TexturePath {
    @JvmField
    val ANVIL = Identifier("textures/gui/container/anvil.png")

    @JvmField
    val BEACON = Identifier("textures/gui/container/beacon.png")

    @JvmField
    val BLAST_FURNACE = Identifier("textures/gui/container/blast_furnace.png")

    @JvmField
    val BOOK = Identifier("textures/gui/book.png")

    @JvmField
    val BREWING_STAND = Identifier("textures/gui/container/brewing_stand.png")

    @JvmField
    val CARTOGRAPHY_TABLE = Identifier("textures/gui/container/cartography_table.png")

    @JvmField
    val GENERIC_54 = Identifier("textures/gui/container/generic_54.png")

    @JvmField
    val CRAFTING_TABLE = Identifier("textures/gui/container/crafting_table.png")

    @JvmField
    val DISPENSER = Identifier("textures/gui/container/dispenser.png")

    @JvmField
    val ENCHANTING_TABLE = Identifier("textures/gui/container/enchanting_table.png")

    @JvmField
    val FURNACE = Identifier("textures/gui/container/furnace.png")

    @JvmField
    val GRINDSTONE = Identifier("textures/gui/container/grindstone.png")

    @JvmField
    val HOPPER = Identifier("textures/gui/container/hopper.png")

    @JvmField
    val LOOM = Identifier("textures/gui/container/loom.png")

    @JvmField
    val SHULKER_BOX = Identifier("textures/gui/container/shulker_box.png")

    @JvmField
    val SMITHING_TABLE = Identifier("textures/gui/container/smithing.png")

    @JvmField
    val LEGACY_SMITHING_TABLE = Identifier("textures/gui/container/legacy_smithing.png")

    @JvmField
    val SMOKER = Identifier("textures/gui/container/smoker.png")

    @JvmField
    val STONECUTTER = Identifier("textures/gui/container/stonecutter.png")

    @JvmField
    val HORSE = Identifier("textures/gui/container/horse.png")

    @JvmField
    val VILLAGER2 = Identifier("textures/gui/container/villager2.png")

    @JvmField
    val INVENTORY = Identifier("textures/gui/container/inventory.png")

    private val containerTextures = mapOf(
        Identifier("anvil") to ANVIL,
        Identifier("chipped_anvil") to ANVIL,
        Identifier("damaged_anvil") to ANVIL,

        Identifier("barrel") to GENERIC_54,

        Identifier("beacon") to BEACON,

        Identifier("brewing_stand") to BREWING_STAND,

        Identifier("cartography_table") to CARTOGRAPHY_TABLE,

        Identifier("chest") to GENERIC_54,
        Identifier("ender_chest") to GENERIC_54,
        Identifier("trapped_chest") to GENERIC_54,

        Identifier("chest_boat") to GENERIC_54,

        Identifier("chest_minecart") to GENERIC_54,

        Identifier("crafting_table") to CRAFTING_TABLE,

        Identifier("dispenser") to DISPENSER,
        Identifier("dropper") to DISPENSER,

        Identifier("enchanting_table") to ENCHANTING_TABLE,

        Identifier("furnace") to FURNACE,
        Identifier("blast_furnace") to BLAST_FURNACE,
        Identifier("smoker") to SMOKER,

        Identifier("grindstone") to GRINDSTONE,

        Identifier("hopper") to HOPPER,
        Identifier("hopper_minecart") to HOPPER,

        Identifier("horse") to HORSE,
        Identifier("camel") to HORSE,
        Identifier("donkey") to HORSE,
        Identifier("llama") to HORSE,
        Identifier("mule") to HORSE,
        Identifier("skeleton_horse") to HORSE,
        Identifier("zombie_horse") to HORSE,

        Identifier("lectern") to BOOK,

        Identifier("loom") to LOOM,

        Identifier("shulker_box") to SHULKER_BOX,
        Identifier("black_shulker_box") to SHULKER_BOX,
        Identifier("blue_shulker_box") to SHULKER_BOX,
        Identifier("brown_shulker_box") to SHULKER_BOX,
        Identifier("cyan_shulker_box") to SHULKER_BOX,
        Identifier("gray_shulker_box") to SHULKER_BOX,
        Identifier("green_shulker_box") to SHULKER_BOX,
        Identifier("light_blue_shulker_box") to SHULKER_BOX,
        Identifier("light_gray_shulker_box") to SHULKER_BOX,
        Identifier("lime_shulker_box") to SHULKER_BOX,
        Identifier("magenta_shulker_box") to SHULKER_BOX,
        Identifier("orange_shulker_box") to SHULKER_BOX,
        Identifier("pink_shulker_box") to SHULKER_BOX,
        Identifier("purple_shulker_box") to SHULKER_BOX,
        Identifier("red_shulker_box") to SHULKER_BOX,
        Identifier("white_shulker_box") to SHULKER_BOX,
        Identifier("yellow_shulker_box") to SHULKER_BOX,

        Identifier("smithing_table") to SMITHING_TABLE,

        Identifier("stonecutter") to STONECUTTER,

        Identifier("villager") to VILLAGER2,
        Identifier("wandering_trader") to VILLAGER2,
    )

    /**
     * Returns the texture path of the given container, or `null`, if it's unknown.
     *
     * @param container The id of the entity or block entity to get its GUI texture
     */
    @JvmStatic
    fun ofContainer(container: Identifier) = containerTextures[container]
}