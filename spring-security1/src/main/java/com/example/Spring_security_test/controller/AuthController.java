package com.example.Spring_security_test.controller;

import com.example.Spring_security_test.model.Login;
import com.example.Spring_security_test.model.Register;
import com.example.Spring_security_test.model.Users;
import com.example.Spring_security_test.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @GetMapping("/test")
    public String testApi(){
        return "TestApi works.";
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Register register) {
        return ResponseEntity.ok().body(service.register(register));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Login login) {
        return service.authenticate(login);
    }

    @GetMapping("/{id}/{role}")
    public ResponseEntity<Users> updateRole(@PathVariable int id, @PathVariable String role){
        return service.update(id, role);
    }

}

