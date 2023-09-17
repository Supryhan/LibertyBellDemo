package com.twg.liberty.service.impl;

import com.twg.liberty.model.ReelSymbol;
import com.twg.liberty.model.User;
import com.twg.liberty.service.LibertyGameService;
import com.twg.liberty.service.helpers.PayTable;
import com.twg.liberty.service.helpers.ReelStrips;
import org.javatuples.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Service
public class SimpleLibertyService implements LibertyGameService {

    @Autowired
    SimpleUserService userService;

    private Random random = new Random();
    @Override
    public List<ReelSymbol> generateReels() {

        int randomIndex1 = random.nextInt(ReelStrips.reelStrip1.size());
        int randomIndex2 = random.nextInt(ReelStrips.reelStrip2.size());
        int randomIndex3 = random.nextInt(ReelStrips.reelStrip3.size());

        ReelSymbol reelSymbol1 = ReelStrips.reelStrip1.get(randomIndex1);
        ReelSymbol reelSymbol2 = ReelStrips.reelStrip1.get(randomIndex2);
        ReelSymbol reelSymbol3 = ReelStrips.reelStrip1.get(randomIndex3);

        String logText = String.format("Generated reels for user: [%s, %s, %s]", reelSymbol1, reelSymbol2, reelSymbol3);
        System.out.println(logText);
        return new LinkedList<>(){{
            add(reelSymbol1);
            add(reelSymbol2);
            add(reelSymbol3);
        }};
    }

    @Override
    public Pair<List<ReelSymbol>, Integer> findCombinations(List<ReelSymbol> reels) {
        int winAmount = PayTable.payTable.getOrDefault(reels, 0);
        List<ReelSymbol> winReels = winAmount == 0 ? Collections.<ReelSymbol>emptyList() : reels;
        System.out.println("Found combinations for user:" + winReels + ", and got win: " + winAmount);
        return new Pair<>(winReels, winAmount);
    }

    @Override
    public int calculate(Pair<List<ReelSymbol>, Integer> winLine) {
        int winAmount = winLine.getValue1();
        System.out.println("User's win: " + winAmount);
        return winAmount;
    }

    public User processUser(int userId, int currentWin) {
        User user = userService.getUser(userId);
        user.setLastWin(currentWin);
        user.setTotalAmount(user.getTotalAmount() + currentWin);
        userService.updateUser(userId, user);
        return user;
    }

}
