package com.cssl.dao;

import java.util.List;

import com.cssl.pojo.Student;

public interface StudentMapper {
	public List<Student> findAll();
	public int updateStudent(Student stu);

}
