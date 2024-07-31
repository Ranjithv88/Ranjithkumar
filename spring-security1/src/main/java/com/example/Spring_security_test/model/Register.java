package com.example.Spring_security_test.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Register {
    private String name;
    private String email;
    private String password;
    private String number;
}
