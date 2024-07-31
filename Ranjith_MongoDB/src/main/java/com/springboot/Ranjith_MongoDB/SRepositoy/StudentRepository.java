package com.springboot.Ranjith_MongoDB.SRepositoy;

import com.springboot.Ranjith_MongoDB.SModel.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student,String> {

}
