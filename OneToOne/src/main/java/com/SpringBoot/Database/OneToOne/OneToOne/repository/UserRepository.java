package com.SpringBoot.Database.OneToOne.OneToOne.repository;


import com.SpringBoot.Database.OneToOne.OneToOne.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Person,Long> {
}
