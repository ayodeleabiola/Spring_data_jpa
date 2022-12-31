package com.spring.data.Jpa.studentController;

import com.spring.data.Jpa.courseEntity.Course;
import com.spring.data.Jpa.courseRepository.Course_Repository;
import com.spring.data.Jpa.studentEntity.Student;
import com.spring.data.Jpa.studentRepository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/student/course")
public class Student_Controller {
    private StudentRepository studentRepository;
    private Course_Repository course_repository;
    private Student_Controller(StudentRepository studentRepository,
                               Course_Repository courseRepository)
    {
        this.studentRepository = studentRepository;
        this.course_repository = courseRepository;
    }
    @PostMapping()
    public Student saveStudent(@RequestBody Student student)
    {
        return  studentRepository.save(student);
    }
    @GetMapping
    public List<Student> findAllStudent()
    {
        return studentRepository.findAll();
    }
    @GetMapping("{id}")
    public Student findStudentById(@PathVariable("id") Long  student_id)
    {
        return studentRepository.findById(student_id).orElse(null);
    }
    @GetMapping("/find/{name}")
    public List<Student> findStudentContainingByName(@PathVariable String name)
    {
        return studentRepository.findByStudentNameContaining(name);
    }
    @GetMapping("/search/{price}")
    public List<Course> findCourseLessThanPrice(@PathVariable double fees)
    {
        return course_repository.findByFeesLessThan(fees);

    }
}
