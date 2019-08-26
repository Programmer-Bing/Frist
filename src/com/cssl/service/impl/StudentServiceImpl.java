package com.cssl.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cssl.dao.StudentMapper;
import com.cssl.pojo.Student;
import com.cssl.service.StudentService;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper studentMapper;

	@Override
	public List<Student> findAll() {
		
		return studentMapper.findAll();
	}

	@Override
	@Transactional(isolation=Isolation.DEFAULT,
	noRollbackFor=java.sql.SQLException.class,
	propagation=Propagation.REQUIRES_NEW)
	public int updateStudent(Student stu) throws SQLException {
		
		int num = studentMapper.updateStudent(stu);
		//int a=1/0;
		
		/*if(true) {
			throw new SQLException("SQL异常");
		}*/
		
		return num;
	}

}
