package com.twg.liberty.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class BetResult {
    int userId;
    int winAmount;
    List<ReelSymbol> reels;
    List<ReelSymbol> winLine;
}
