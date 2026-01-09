package com.jaysonh.NeoConstruct.items;

import com.jaysonh.NeoConstruct.NeoConstruct;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NCItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NeoConstruct.MOD_ID);

    public static final DeferredItem<Item> SMELT_INGOT = ITEMS.register("smelt_ingot", () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
