package com.springboot.Ranjith_MongoDB.SService;

import com.springboot.Ranjith_MongoDB.SModel.Student;
import com.springboot.Ranjith_MongoDB.SRepositoy.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;

    public String insertData(Student Data){
        studentRepository.save(Data);
        return " Data Saved ! ";
    }

    public List<Student> getApi() {
        return studentRepository.findAll();
    }

    public Student PutApi(String id,Student student){
       student.setId(id);
       return studentRepository.save(student);
    }


}
