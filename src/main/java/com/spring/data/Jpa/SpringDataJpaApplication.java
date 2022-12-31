package com.spring.data.Jpa;

import com.spring.data.Jpa.courseEntity.Course;
import com.spring.data.Jpa.courseRepository.Course_Repository;
import com.spring.data.Jpa.studentEntity.Student;
import com.spring.data.Jpa.studentRepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication {

@Autowired
	StudentRepository studentRepository;
@Autowired
	Course_Repository course_repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}
	/**

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student("Abiola",20,"Ics");
		Course course = new Course("Information retriever","ICS",2,200);
		Course course2 = new Course("Mass communication","MAC",3,300);

		student.getCourses().add(course);
		student.getCourses().add(course2);
		studentRepository.save(student);

	}
	*/
}
