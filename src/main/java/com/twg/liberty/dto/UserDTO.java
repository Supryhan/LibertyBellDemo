package com.twg.liberty.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {
    private int id;
    private String name;
    private int totalAmount;
    private int lastWin;
}
