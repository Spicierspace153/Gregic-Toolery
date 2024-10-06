package com.juiceybeans.toolery.data;

import com.juiceybeans.toolery.data.lang.TooleryLangHandler;
import com.tterrag.registrate.providers.ProviderType;

import static com.juiceybeans.toolery.Toolery.TOOLERY_REGISTRATE;

public class TooleryDatagenDeezNuts {
    public static void init() {
        TOOLERY_REGISTRATE.addDataGenerator(ProviderType.LANG, TooleryLangHandler::init);
    }
}
