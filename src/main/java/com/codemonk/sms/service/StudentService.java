package com.codemonk.sms.service;

import java.util.List;

import com.codemonk.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentByID(long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(long id);
}
