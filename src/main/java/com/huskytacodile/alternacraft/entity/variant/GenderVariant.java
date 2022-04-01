package com.huskytacodile.alternacraft.entity.variant;

import java.util.Arrays;
import java.util.Comparator;


public enum GenderVariant {
    MALE(0),
    FEMALE(1);
    private static final GenderVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(GenderVariant::getId)).toArray(GenderVariant[]::new);
    private final int id;

    GenderVariant(int id) {
        this.id = id;
}

    public int getId() {
        return this.id;
}

    public static GenderVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
