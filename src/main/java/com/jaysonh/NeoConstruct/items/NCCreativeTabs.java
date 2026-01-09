package com.jaysonh.NeoConstruct.items;

import com.jaysonh.NeoConstruct.NeoConstruct;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class NCCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NeoConstruct.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NC_TAB = CREATIVE_MODE_TABS.register("neo_construct_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.neo_construct")).icon(() -> new ItemStack(NCItems.SMELT_INGOT.get())).displayItems(((itemDisplayParameters, output) -> {
        output.accept(NCItems.SMELT_INGOT.get());
    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
