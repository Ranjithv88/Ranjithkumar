package com.SpringBoot.Redis.Controller;

import com.SpringBoot.Redis.Model.Student;
import com.SpringBoot.Redis.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService service;

    @GetMapping("/get")
    public List<Student> getApi () {
        return service.studentGet();
    }

    @PostMapping("/post")
    public String postApi (@RequestBody Student student) {
        return service.studentPost(student);
    }

    @PatchMapping("/patch/{id}")
    public String patchApi ( @RequestBody Student student, @PathVariable long id) {
       student.setId(id);
        return service.patchStudent(student);
    }

}

