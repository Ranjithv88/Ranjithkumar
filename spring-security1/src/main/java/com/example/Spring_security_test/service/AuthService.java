package com.example.Spring_security_test.service;

import com.example.Spring_security_test.config.JwtUtils;
import com.example.Spring_security_test.model.ERole;
import com.example.Spring_security_test.model.Login;
import com.example.Spring_security_test.model.Register;
import com.example.Spring_security_test.model.Users;
import com.example.Spring_security_test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;

    public String register(Register register) {
        var user = Users.builder()
                .userName(register.getName())
                .email(register.getEmail())
                .password(passwordEncoder.encode(register.getPassword()))
                .number(register.getNumber())
                .role(ERole.USER).build();
        userRepository.save(user);
        return "User Added Successfully";
    }

    public ResponseEntity<?> authenticate(Login login) {
        try {
            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(login.getEmail(), login.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }

        Optional<Users> userDetails = userRepository.findByEmail(login.getEmail());
        if (userDetails.isPresent()) {
            String token = jwtUtils.generateToken(userDetails.get());
            return ResponseEntity.ok(token);
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    public ResponseEntity<Users> update(int id, String role) {
        Optional<Users> user = userRepository.findById(id);
        if (user.isPresent()) {
            if (role.equals("DEVELOPER")) {
                user.get().setRole(ERole.DEVLOPER);
            } else if (role.equals("ADMIN")) {
                user.get().setRole(ERole.ADMIN);
            } else {
                user.get().setRole(ERole.USER);
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(userRepository.save(user.get()));
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}
