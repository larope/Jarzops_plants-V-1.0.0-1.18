package net.jarzop.jarzopsplants.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.jarzop.jarzopsplants.JarzopsPlants;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(JarzopsPlants.MOD_ID, name), item);
    }
    public static void registerModItems(){
        JarzopsPlants.LOGGER.info("Registering Mod Items for " + JarzopsPlants.MOD_ID);
    }


    public static final Item APPLE_JUCE = registerItem("apple_juce",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD)));
    public static final Item CARROT_JUCE = registerItem("carrot_juce",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD)));
}
