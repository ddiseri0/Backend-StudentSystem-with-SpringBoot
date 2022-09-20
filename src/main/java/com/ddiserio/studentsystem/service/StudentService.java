package com.ddiserio.studentsystem.service;
import com.ddiserio.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent (Student student);
    public List<Student> getAllStudent();
}
