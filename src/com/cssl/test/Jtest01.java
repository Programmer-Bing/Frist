package com.cssl.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cssl.controller.StudentController;
import com.cssl.pojo.Student;

public class Jtest01 {
	@Test
	public void test1() {
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentController con = ctx.getBean(StudentController.class);
		List<Student> findAll = con.findAll();
		for (Student student : findAll) {
			System.out.println("s:"+student);
		}
		
		System.out.println("*************************");
		for(String name:ctx.getBeanDefinitionNames()) {
			System.out.println("beanName:"+name);
		}
	}
	
	@Test
	public void test2() throws SQLException {
		//new ArithmeticException();
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentController con = ctx.getBean(StudentController.class);
		Student stu=new Student(15, "刘云�?",null);
		int updateStudent = con.updateStudent(stu);
		System.out.println("rs:"+updateStudent);
	}
	
	
	

}
