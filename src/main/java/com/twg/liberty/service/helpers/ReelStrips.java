package com.twg.liberty.service.helpers;

import com.twg.liberty.model.ReelSymbol;

import java.util.ArrayList;
import java.util.List;

public final class ReelStrips {
    public static List<ReelSymbol> reelStrip1 = new ArrayList<>(){{
        add(ReelSymbol.B);
        add(ReelSymbol.Hs);
        add(ReelSymbol.Sp);
        add(ReelSymbol.Hs);
        add(ReelSymbol.D);
        add(ReelSymbol.Hs);
        add(ReelSymbol.Sp);
        add(ReelSymbol.Hs);
        add(ReelSymbol.Hr);
        add(ReelSymbol.Hs);
    }};
    public static List<ReelSymbol> reelStrip2 = reelStrip1;
    public static List<ReelSymbol> reelStrip3 = new ArrayList<>(){{
        add(ReelSymbol.B);
        add(ReelSymbol.D);
        add(ReelSymbol.St);
        add(ReelSymbol.Sp);
        add(ReelSymbol.B);
        add(ReelSymbol.D);
        add(ReelSymbol.Hr);
        add(ReelSymbol.St);
        add(ReelSymbol.Sp);
        add(ReelSymbol.D);
    }};
}
