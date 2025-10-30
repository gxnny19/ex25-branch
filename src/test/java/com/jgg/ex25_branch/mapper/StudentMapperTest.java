package com.jgg.ex25_branch.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.jgg.ex25_branch.domain.StudentTest;

@Mapper
public interface StudentMapperTest {

	@Insert("INSERT INTO student(NAME, email, age) VALUES \r\n" + "(#{name}, #{email}, #{age})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int insert(StudentTest student);

	@Select("SELECT * FROM student ORDER BY #{id} DESC")
	List<StudentTest> findall();

	@Select("SELECT * FROM student WHERE id = #{id}")
	StudentTest findById(Long id);
}
