package com.twg.liberty.service;

import com.twg.liberty.model.Symbol;

import java.util.List;

public interface LibertyGameService {

    void makeBet(int userId);

    List<Symbol> generateReels();

    List<Symbol> findCombinations();

    int calculate();
}
