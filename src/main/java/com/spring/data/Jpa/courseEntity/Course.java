package com.spring.data.Jpa.courseEntity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.spring.data.Jpa.studentEntity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name ="Course_table")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String abbrevation;
    private int module;
    private double fees;

    @ManyToMany(mappedBy = "courses",fetch = FetchType.LAZY)
    //@JsonManagedReference
    private Set<Student> students = new HashSet<>();


}
