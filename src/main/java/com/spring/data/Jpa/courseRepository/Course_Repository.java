package com.spring.data.Jpa.courseRepository;

import com.spring.data.Jpa.courseEntity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Course_Repository extends JpaRepository<Course,Long> {
    public List<Course> findByFeesLessThan(double fees);
}
