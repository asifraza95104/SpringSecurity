package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.bean.Student;
import com.app.repositories.IStudentDao;

@Service
//@Component
public class StudentServiceImpl implements IStudentService{

	   @Autowired
	 private IStudentDao dao;
	
	@Override
	@Transactional
	public int saveStudent(Student student) {
		return dao.saveStudent(student);
	}

	@Override
	@Transactional
	public void updateStudent(Student student) {
		dao.updateStudent(student);
		
	}

	@Override
	@Transactional
	public void deleteStudent(int sid) {
        dao.deleteStudent(sid);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Student getStudent(int sid) { 
          return dao.getStudent(sid);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Student> getAllStudent() {
		 
		return dao.getAllStudent();
	}

	
}
