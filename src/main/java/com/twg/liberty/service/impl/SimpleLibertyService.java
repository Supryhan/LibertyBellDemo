package com.twg.liberty.service.impl;

import com.twg.liberty.model.ReelSymbol;
import com.twg.liberty.service.LibertyGameService;
import com.twg.liberty.service.helpers.ReelStrips;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Service
public class SimpleLibertyService implements LibertyGameService {

    Random random = new Random();
    @Override
    public List<ReelSymbol> generateReels() {
        System.out.println("Generated reels for user.");

        int randomIndex1 = random.nextInt(ReelStrips.reelStrip1.size());
        int randomIndex2 = random.nextInt(ReelStrips.reelStrip2.size());
        int randomIndex3 = random.nextInt(ReelStrips.reelStrip3.size());

        ReelSymbol reelSymbol1 = ReelStrips.reelStrip1.get(randomIndex1);
        ReelSymbol reelSymbol2 = ReelStrips.reelStrip1.get(randomIndex2);
        ReelSymbol reelSymbol3 = ReelStrips.reelStrip1.get(randomIndex3);

        System.out.println("ReelSymbol 1: " + reelSymbol1);
        System.out.println("ReelSymbol 2: " + reelSymbol2);
        System.out.println("ReelSymbol 3: " + reelSymbol3);
        return new LinkedList<>(){{
            add(reelSymbol1);
            add(reelSymbol2);
            add(reelSymbol3);
        }};
    }

    @Override
    public List<ReelSymbol> findCombinations(List<ReelSymbol> reels) {
        System.out.println("Found combinations for user." + reels.toString());
        return new LinkedList<>(reels);
    }

    @Override
    public int calculate(List<ReelSymbol> reels) {
        System.out.println("Calculated for user.");
        return 100;
    }

}
