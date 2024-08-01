package com.SpringBasics.Crud_thymeleaf_MySql.repository;

import com.SpringBasics.Crud_thymeleaf_MySql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}