package com.twg.liberty.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private int totalAmount;
    private int lastWin;
}
