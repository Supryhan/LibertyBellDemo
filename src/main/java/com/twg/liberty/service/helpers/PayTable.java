package com.twg.liberty.service.helpers;

import com.twg.liberty.model.ReelSymbol;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.twg.liberty.model.ReelSymbol.*;

public final class PayTable {
    private static List<ReelSymbol> tripleBell = Arrays.asList(B, B, B);
    private static List<ReelSymbol> tripleHeart = Arrays.asList(Hr, Hr, Hr);
    private static List<ReelSymbol> tripleDiamond = Arrays.asList(D, D, D);
    private static List<ReelSymbol> tripleSpade = Arrays.asList(Sp, Sp, Sp);
    private static List<ReelSymbol> doubleHorseshoeAndStar = Arrays.asList(Hs, Hs, St);

    private static List<ReelSymbol> doubleHorseshoeAndBell = Arrays.asList(Hs, Hs, B);
    private static List<ReelSymbol> doubleHorseshoeAndHeart = Arrays.asList(Hs, Hs, Hr);
    private static List<ReelSymbol> doubleHorseshoeAndDiamond = Arrays.asList(Hs, Hs, D);
    private static List<ReelSymbol> doubleHorseshoeAndSpade = Arrays.asList(Hs, Hs, Sp);

    public final static Map<List<ReelSymbol>, Integer> payTable = new HashMap<>();

    static {
        payTable.put(tripleBell, 20);
        payTable.put(tripleHeart, 16);
        payTable.put(tripleDiamond, 12);
        payTable.put(tripleSpade, 8);
        payTable.put(doubleHorseshoeAndStar, 4);
        payTable.put(doubleHorseshoeAndBell, 2);
        payTable.put(doubleHorseshoeAndHeart, 2);
        payTable.put(doubleHorseshoeAndDiamond, 2);
        payTable.put(doubleHorseshoeAndSpade, 2);
    }

}
