package com.adilzhanshukenov.studentsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adilzhanshukenov.studentsystem.entity.Student;
import com.adilzhanshukenov.studentsystem.repository.StudentRepository;

@SpringBootApplication
public class StudentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentSystemApplication.class, args);
		
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1 = new Student("Adil", "Shukenov", "as@mail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Asyl", "Khan", "ak@mail.com");
		 * studentRepository.save(student2);
		 */
		
		
	}

}
