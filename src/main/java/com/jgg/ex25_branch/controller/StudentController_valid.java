package com.jgg.ex25_branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.jgg.ex25_branch.domain.Student;
import com.jgg.ex25_branch.service.StudentService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("/students/valid")
@RequiredArgsConstructor
public class StudentController_valid {
	private final StudentService studentService = new StudentService();
	
	@GetMapping("/new/valid")
	public String createFormValid(Model model) {
		model.addAllAttributes(studentService.getAllStudents());
		return "student/form_validtest";
	}
	
	@PostMapping
	public String create(@Valid @ModelAttribute Student student, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "student/form_validtest";
		}
		studentService.createStudent(student);
		return "redirect:/students/valid";
	}
	
	@GetMapping("/{id}/edit")
	public String updateForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudent(id));
		return "student/form_validtest";
	}
	
	@PostMapping("/{id}")
	public String update(@PathVariable Long id, @Valid @ModelAttribute Student student, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "student/form_validtest";
		}
		student.setId(id);
		studentService.updateStudent(student);
		return "redirect:/students/valid";
	}
	
	@PostMapping("/{id}/delete")
	public String delete(@PathVariable Long id) {
		studentService.deleteStudent(id);
		return "redirect:/students/valid";
	}
	
	
	
}
