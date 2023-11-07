package net.bdumouli.winecraft.items;

import net.bdumouli.winecraft.Winecraft;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup WINECRAFT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Winecraft.MOD_ID, "winecraft"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.winecraft"))
                    .icon(()->new ItemStack(ModItems.RED_GRAPE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RED_GRAPE);
                        entries.add(ModItems.WHITE_GRAPE);
                    }).build());

    public static void registerItemGroups(){
        Winecraft.LOGGER.info("Registering item groups for: " + Winecraft.MOD_ID);
    }
}
