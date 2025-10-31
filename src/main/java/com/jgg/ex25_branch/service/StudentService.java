package com.jgg.ex25_branch.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jgg.ex25_branch.domain.Student;
import com.jgg.ex25_branch.mapper.StudentMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StudentService {
	
	private final StudentMapper studentMapper;

//	public String getMyString() {
//		return "test";
//	}
//	
//	public Integer getMyIneger() {
//		return 99;
//	}
//
//	public MyStudent getStudent() {
//		Java 방식
//		MyStudent myStudent = new MyStudent();
//		myStudent.setName("홍길동");
//		myStudent.setAge(10);
//		
//		return myStudent;
//	}
//	
//	public String getStudentName() {
//		Spring 방식
//		MyStudent myStudent2 = new MyStudent();
//		myStudent2.setName("이지매222");
//		myStudent2.setAge(20);
//		
//		return myStudent2.getName();
//	}

	public List<Student> getAllStudents() {
//		매퍼 오브젝트에게 값을 요청
		return studentMapper.findAll();
	}

	public Student getStudent(Long id) {
		return studentMapper.findById(id);
	}

	@Transactional
	public void createStudent(Student student) {
		studentMapper.insert(student);
	}

	@Transactional
	public void updateStudent(Student student) {
		studentMapper.update(student);
	}

	@Transactional
	public void deleteStudent(Long id) {
		studentMapper.delete(id);
	}
}
