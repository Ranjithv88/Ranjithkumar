package com.SpringBoot.ranjith05.repository;

import com.SpringBoot.ranjith05.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {
}
