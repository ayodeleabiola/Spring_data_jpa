package com.spring.data.Jpa.studentRepository;

import com.spring.data.Jpa.studentEntity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    public List<Student> findByStudentNameContaining(String name);
}
