package com.springboot.h2_database.depository;

import com.springboot.h2_database.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDepository extends JpaRepository<Users,Integer> {
}

