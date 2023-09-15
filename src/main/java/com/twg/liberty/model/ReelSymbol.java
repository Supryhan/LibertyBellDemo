package com.twg.liberty.model;

public enum ReelSymbol {
    B("Bell"),
    Hr("Heart"),
    D("Diamond"),
    Sp("Spade"),
    Hs("Horseshoe"),
    St("Star");
    public final String label;
    private ReelSymbol(String label) {
        this.label = label;
    }
}
