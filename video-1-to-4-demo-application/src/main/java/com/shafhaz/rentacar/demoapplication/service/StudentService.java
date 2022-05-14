package com.shafhaz.rentacar.demoapplication.service;

import com.shafhaz.rentacar.demoapplication.model.Student;

public interface StudentService {

    Student save(Student student);

    Student fetchStudentById(int id);
}
