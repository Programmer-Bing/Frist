package com.cssl.service;

import java.sql.SQLException;
import java.util.List;

import com.cssl.pojo.Student;

public interface StudentService {

	
	public List<Student> findAll();
	public int updateStudent(Student stu)throws SQLException;
}
