package com.springboot.h2_database.usercontroller;

import com.springboot.h2_database.model.Users;
import com.springboot.h2_database.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class userController {
    @Autowired
    public UserService userService;

    @GetMapping("/testing")
    public String in(){
        return "get successfully working !";
    }

    @PostMapping("/insert")
    public String insertdata(@RequestBody Users Data){
        return userService.insertData(Data);
    }
    @PostMapping()
    public String rest(@PathVariable long id, @PathVariable String name ,@PathVariable String email, @PathVariable String department, @PathVariable String salary){
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(department);
        System.out.println(salary);

        return " Data Saved ! ";
    }

}

