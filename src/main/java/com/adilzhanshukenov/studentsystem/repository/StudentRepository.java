package com.adilzhanshukenov.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adilzhanshukenov.studentsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
