package com.twg.liberty.service;

import com.twg.liberty.model.BetResult;
import com.twg.liberty.model.ReelSymbol;
import com.twg.liberty.model.User;
import org.javatuples.Pair;

import java.util.List;

public interface LibertyGameService {

    default BetResult makeBet(int userId) {
        System.out.println("User #" + userId + " made bet.");
        List<ReelSymbol> generated = generateReels();
        Pair<List<ReelSymbol>, Integer> combinations = findCombinations(generated);
        int currentWin = calculate(combinations);
        User user = processUser(userId, currentWin);
        BetResult result = new BetResult(userId, currentWin, user.getTotalAmount(), generated, combinations.getValue0());
        return result;
    }

    List<ReelSymbol> generateReels();

    Pair<List<ReelSymbol>, Integer> findCombinations(List<ReelSymbol> generatedReels);

    int calculate(Pair<List<ReelSymbol>, Integer> winLine);

    User processUser(int userId, int currentWin);
}
