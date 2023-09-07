package com.twg.liberty.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Symbol {
    private int id;
    private String name;
    private int value;
}
