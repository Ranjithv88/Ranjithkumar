package com.SpringBoot.ranjith05.controller;

import com.SpringBoot.ranjith05.Model.Users;
import com.SpringBoot.ranjith05.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/get")
    public List<Users> getapi (){
        return service.GetApi();
    }

    @PostMapping("/post")
    public String postapi(@RequestBody Users data, @PathVariable String name, @PathVariable String email,@PathVariable String number,@PathVariable LocalDate dataOfBirth,@PathVariable String password,@PathVariable LocalDate createrOn, @PathVariable boolean status) {
        service.PostApi(data);
        return " Data Saved ! ";
    }

}

