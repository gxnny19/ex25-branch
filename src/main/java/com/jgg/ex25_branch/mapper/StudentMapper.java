package com.jgg.ex25_branch.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import com.jgg.ex25_branch.domain.Student;

@Mapper
public interface StudentMapper {
	
	List<Student> findAll();

	Student findById(Long id);

	@Insert("INSERT INTO student(NAME, email, age) \r\n"
			+ "  	VALUES (#{name}, #{email}, #{age})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void insert(Student student);

	void update(Student student);

	void delete(Long id);
}
