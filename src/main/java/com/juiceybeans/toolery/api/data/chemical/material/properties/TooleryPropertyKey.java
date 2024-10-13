package com.juiceybeans.toolery.api.data.chemical.material.properties;

import com.gregtechceu.gtceu.api.data.chemical.material.properties.IMaterialProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;

public class TooleryPropertyKey<T extends IMaterialProperty<T>> {
    public static final PropertyKey<ArmorProperty> ARMOR = new PropertyKey<>("armor", ArmorProperty.class);

}
