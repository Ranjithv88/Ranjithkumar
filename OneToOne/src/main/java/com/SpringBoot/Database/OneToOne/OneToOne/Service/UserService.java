package com.SpringBoot.Database.OneToOne.OneToOne.Service;

import com.SpringBoot.Database.OneToOne.OneToOne.Model.Person;
import com.SpringBoot.Database.OneToOne.OneToOne.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<Person> GetApi(){
        return repository.findAll();
    }

    public String insertData(Person Data) {
        repository.save(Data);
        return "Data Saved !";

    }

}

