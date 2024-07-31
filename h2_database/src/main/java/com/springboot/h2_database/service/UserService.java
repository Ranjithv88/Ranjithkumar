package com.springboot.h2_database.service;

import com.springboot.h2_database.depository.UsersDepository;
import com.springboot.h2_database.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    public UsersDepository usersDepository;

    public String insertData(Users Data){
        usersDepository.save(Data);
        return "Data Saved !";
    }

}

