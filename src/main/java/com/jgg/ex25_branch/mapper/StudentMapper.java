package com.jgg.ex25_branch.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.jgg.ex25_branch.domain.Student;

@Mapper
public interface StudentMapper {

    // 전체 조회
    List<Student> findAll();

    // 단건 조회
    Student findById(@Param("id") Long id);

    // 등록
    void insert(Student student);

    // 수정
    void update(Student student);

    // 삭제
    void delete(@Param("id") Long id);
}