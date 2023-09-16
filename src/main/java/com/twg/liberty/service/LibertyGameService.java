package com.twg.liberty.service;

import com.twg.liberty.model.BetResult;
import com.twg.liberty.model.ReelSymbol;

import java.util.List;

public interface LibertyGameService {

    default BetResult makeBet(int userId) {
        System.out.println("User #" + userId + " made bet.");
        List<ReelSymbol> generated = generateReels();
        List<ReelSymbol> found = findCombinations(generated);
        int calculated = calculate(found);
        BetResult result = new BetResult(userId, calculated, generated, found);
        return result;
    }

    List<ReelSymbol> generateReels();

    List<ReelSymbol> findCombinations(List<ReelSymbol> reels);

    int calculate(List<ReelSymbol> reels);
}
