package com.example.springthymeleafform.repository;

import com.example.springthymeleafform.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}