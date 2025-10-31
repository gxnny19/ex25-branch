package com.jgg.ex25_branch.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jgg.ex25_branch.domain.Student;

@Mapper
public interface StudentMapper {
	
//	<select id="findAll" resultType="Student">
	List<Student> findAll();
	
}
