package com.adilzhanshukenov.studentsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adilzhanshukenov.studentsystem.entity.Student;
import com.adilzhanshukenov.studentsystem.repository.StudentRepository;
import com.adilzhanshukenov.studentsystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}




}
