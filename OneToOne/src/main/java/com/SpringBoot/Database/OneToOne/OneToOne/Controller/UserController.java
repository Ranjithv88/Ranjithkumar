package com.SpringBoot.Database.OneToOne.OneToOne.Controller;

import com.SpringBoot.Database.OneToOne.OneToOne.Model.Person;
import com.SpringBoot.Database.OneToOne.OneToOne.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/get")
    public List<Person> in(){
        return service.GetApi();
    }

    @PostMapping("/post")
    public String insertdata(@RequestBody Person data){
        return service.insertData(data);
    }

}

