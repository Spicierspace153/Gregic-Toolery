package com.juiceybeans.toolery.common.data;

import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.juiceybeans.toolery.Toolery;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.world.item.CreativeModeTab;

import static com.juiceybeans.toolery.Toolery.TOOLERY_REGISTRATE;

public class TooleryTabs {
    public static RegistryEntry<CreativeModeTab> TOOLERY_ARMORS = TOOLERY_REGISTRATE.defaultCreativeTab("toolery_armors",
                    builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator("toolery_armors", TOOLERY_REGISTRATE))
                            .icon(() -> TooleryItems.TEST_CHESTPLATE.asStack())
                            .title(TOOLERY_REGISTRATE.addLang("itemGroup", Toolery.id("toolery_armors"),  "Toolery Armors"))
                            .build())
            .register();

    static {
        TOOLERY_REGISTRATE.creativeModeTab(() -> TooleryTabs.TOOLERY_ARMORS);
    }

    public static void init() {

    }
}
