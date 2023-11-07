package net.bdumouli.winecraft.items;

import net.bdumouli.winecraft.Winecraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RED_GRAPE = registerItem("red_grape", new Item(new FabricItemSettings()));
    public static final Item WHITE_GRAPE = registerItem("white_grape", new Item(new FabricItemSettings()));

    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries){
        entries.add(RED_GRAPE);
        entries.add(WHITE_GRAPE);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Winecraft.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Winecraft.LOGGER.info("Registering mod items for : " + Winecraft.MOD_ID);
        //0ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
    }

}
