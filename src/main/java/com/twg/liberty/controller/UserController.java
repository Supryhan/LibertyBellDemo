package com.twg.liberty.controller;

import com.twg.liberty.dto.UserDTO;
import com.twg.liberty.model.User;
import com.twg.liberty.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/user")
    public int addUser(@RequestParam String login, @RequestParam String pass){
        int userId = userService.addUser(login, pass);
        return userId;
    }

    @GetMapping("/user/{id}")
    public UserDTO getUser(@PathVariable("id") int id){
        User user = userService.getUser(id);
        return convertToDto(user);
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers(){
        return userService.getUsers().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @DeleteMapping("/user/{id}")
    public void removeUser(@PathVariable("id") int id){
        userService.removeUser(id);
    }

    private UserDTO convertToDto(User user) {
        return new UserDTO(user.getId(), user.getName(), user.getTotalAmount(), user.getLastWin());
    }
}
