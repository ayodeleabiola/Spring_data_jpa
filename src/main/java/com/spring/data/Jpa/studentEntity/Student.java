package com.spring.data.Jpa.studentEntity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.data.Jpa.courseEntity.Course;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity

@Table(name ="student_table")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String studentName;
    private int age;
    private String depart;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
   @JoinTable(name = "Student_Course_table",
   joinColumns = {
           @JoinColumn(name = "Student_id",referencedColumnName = "id")
                },
    inverseJoinColumns ={
           @JoinColumn(name = "Course_id",referencedColumnName = "id")
    }
   )
    @JsonIgnore
   //@JsonBackReference
    private Set<Course> courses =new HashSet<>();

}
