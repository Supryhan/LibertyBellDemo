package com.twg.liberty.controller;

import com.twg.liberty.dto.UserDTO;
import com.twg.liberty.model.User;
import com.twg.liberty.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/user")
    public void addUser(@RequestParam String login, @RequestParam String pass){
        userService.addUser(login, pass);
    }

    @GetMapping("/user/{id}")
    public UserDTO getUser(@PathVariable("id") int id){
        User user = userService.getUser(id);
        return new UserDTO(user.getId(), user.getName(), user.getAccountValue(), user.getLastWin());
    }

    @GetMapping("/users")
    public void getUsers(){
        userService.getUsers();
    }

    @DeleteMapping("/user/{id}")
    public void removeUser(@PathVariable("id") int id){
        userService.removeUser(id);
    }

}
