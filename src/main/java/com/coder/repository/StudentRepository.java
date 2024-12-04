package com.coder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	public Student findByEmail(String email);
}
