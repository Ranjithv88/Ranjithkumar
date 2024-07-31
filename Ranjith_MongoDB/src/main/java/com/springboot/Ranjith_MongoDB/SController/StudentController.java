package com.springboot.Ranjith_MongoDB.SController;

import com.springboot.Ranjith_MongoDB.SModel.Student;
import com.springboot.Ranjith_MongoDB.SService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {
    @Autowired
    public StudentService studentService;

    @GetMapping("/get")
    public List<Student> getApi() {
        return studentService.getApi();
    }

    @PostMapping("/post")
    public String insertdata(@RequestBody Student Data){
        return studentService.insertData(Data);
    }
    @PostMapping()
    public String test(@PathVariable String id,@PathVariable String name,@PathVariable String sclass){
        System.out.println(id);
        System.out.println(name);
        System.out.println(sclass);
        return " Data Saved ! ";
    }

    @PutMapping("/put")
    public String putapi(@PathVariable String id,@RequestBody Student student){
        Student stud = studentService.PutApi(id,student);
        return " Update Successfully ";
    }

}
