package com.twg.liberty.dto;

import com.twg.liberty.model.ReelSymbol;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserDTO {
    private int id;
    private String name;
    private int totalAmount;
    private int lastWin;
}
