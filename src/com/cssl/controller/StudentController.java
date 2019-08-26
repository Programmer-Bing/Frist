package com.cssl.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cssl.pojo.Student;
import com.cssl.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService ss;
	
	public List<Student> findAll(){
		
		return ss.findAll();
	}
	

	public int updateStudent(Student stu) throws SQLException{
		
		return ss.updateStudent(stu);
	}
	
}
