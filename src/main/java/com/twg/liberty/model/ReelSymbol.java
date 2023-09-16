package com.twg.liberty.model;

import java.util.HashMap;
import java.util.Map;

public enum ReelSymbol {
    B(0, "Bell"),
    Hr(1, "Heart"),
    D(2, "Diamond"),
    Sp(3, "Spade"),
    Hs(4, "Horseshoe"),
    St(5, "Star");

    private static final Map<Integer, ReelSymbol> BY_ID = new HashMap<>();
    static {
        for (ReelSymbol symbol : values()) {
            BY_ID.put(symbol.id, symbol);
        }
    }
    public final int id;
    public final String label;
    private ReelSymbol(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public static ReelSymbol valueOfId(Integer id) {
        return BY_ID.get(id);
    }

}
