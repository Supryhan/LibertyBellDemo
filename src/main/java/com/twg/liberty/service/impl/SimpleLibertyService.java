package com.twg.liberty.service.impl;

import com.twg.liberty.model.Symbol;
import com.twg.liberty.service.LibertyGameService;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class SimpleLibertyService implements LibertyGameService {

    @Override
    public void makeBet(int userId) {
        System.out.println("User #" + userId + " made bet.");
        generateReels();
        findCombinations();
        calculate();
    }


    @Override
    public List<Symbol> generateReels() {
        System.out.println("Generated reels for user.");
        return new LinkedList<>(){{
            add(new Symbol(1, "9", 9));
            add(new Symbol(1, "9", 9));
            add(new Symbol(1, "9", 9));
        }};
    }

    @Override
    public List<Symbol> findCombinations() {
        System.out.println("Found combinations for user.");
        return new LinkedList<>(){{
            add(new Symbol(1, "9", 9));
            add(new Symbol(1, "9", 9));
            add(new Symbol(1, "9", 9));
        }};
    }

    @Override
    public int calculate() {
        System.out.println("Calculated for user.");
        return 100;
    }

}
