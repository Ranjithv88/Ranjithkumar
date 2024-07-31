package com.SpringBoot.ranjith05.service;

import com.SpringBoot.ranjith05.Model.Users;
import com.SpringBoot.ranjith05.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<Users> GetApi() {
        return repository.findAll();
    }

    public Users PostApi(Users data){
        return repository.save(data);
    }


}

