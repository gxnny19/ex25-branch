package com.jgg.ex25_branch.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jgg.ex25_branch.domain.Student;
import com.jgg.ex25_branch.service.StudentService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentRestController {

	private final StudentService studentService;
	
//	@GetMapping
//	public String list() {
//		return "test";
//	}
	
//	@GetMapping
//	public String list() {
//		return studentService.getMyString;
//	}
	
//	@GetMapping
//	public Integer list() {
//		return studentService.getMyInteger;
//	}
	
//	@GetMapping
//	public MyStudent MyStudent() {
//		return studentService.getStudent();
//	}
	
//	@GetMapping
//	public String MyStudent() {
//		return studentService.getStudentName();
//	}
	
	@GetMapping
	public List<Student> MyStudent() {
		return studentService.getAllStudents();
	}
}
