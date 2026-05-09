package net.boop9.horsingaround.item;

import net.boop9.horsingaround.HorsingAround;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item HORSE = registerItem("horse", new Item(new Item.Settings()));

    public static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(HorsingAround.MOD_ID, name), item);
    }

    public static void registerModItems() {

        HorsingAround.LOGGER.info("Mod" + HorsingAround.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(HORSE);
        });
    }
}