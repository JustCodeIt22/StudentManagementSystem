package com.codemonk.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codemonk.sms.entity.Student;

public interface StudentRepository  extends JpaRepository<Student, Long>{

}
