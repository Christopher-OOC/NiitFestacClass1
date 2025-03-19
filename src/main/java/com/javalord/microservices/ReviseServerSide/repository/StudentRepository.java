package com.javalord.microservices.ReviseServerSide.repository;

import com.javalord.microservices.ReviseServerSide.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
