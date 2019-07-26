package com.uestc.mardan.dao;

import java.util.List;
import com.uestc.mardan.entity.Student;

public interface StudentDao {
    int getTotal();
    void addStudent(Student student);
    void deleteStudent(int id);
    void updateStudent(Student student);
    Student getStudent(int id);
    List<Student> list(int start, int count);
}
