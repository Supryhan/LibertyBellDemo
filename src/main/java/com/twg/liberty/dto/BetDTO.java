package com.twg.liberty.dto;

import com.twg.liberty.model.ReelSymbol;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
public class BetDTO {
    int userId;
    int win;
    int totalAmount;
//    List<List<Symbol>> reels;
    List<ReelSymbol> reels;
    List<ReelSymbol> winLine;
}
