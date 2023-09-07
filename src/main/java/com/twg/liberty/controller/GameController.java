package com.twg.liberty.controller;

import com.twg.liberty.service.LibertyGameService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class GameController {

    private LibertyGameService libertyService;

    @GetMapping("/game/bet/{userId}")
    public void makeBet(@PathVariable("userId") int userId){
        libertyService.makeBet(userId);
    }
}
