package com.twg.liberty.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
public class BetResult {
    int userId;
    int winAmount;
    int totalAmount;
    List<ReelSymbol> reelsGenerated;
    List<ReelSymbol> winReelsLine;
    String message;
}
