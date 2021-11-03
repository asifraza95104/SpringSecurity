package com.app.repositories;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.bean.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {

	 @Autowired
	private HibernateTemplate hibernateTemplate;
	  
	@Override
	public int saveStudent(Student student) {

		return (Integer)hibernateTemplate.save(student);
		
	}

	@Override
	public void updateStudent(Student student) {

		 hibernateTemplate.update(student);
		
	}

	@Override
	public void deleteStudent(int sid) {
	 
		  hibernateTemplate.delete(new Student(sid));
		
	}

	@Override
	public Student getStudent(int sid) {
		
		return hibernateTemplate.get(Student.class,sid);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return hibernateTemplate.loadAll(Student.class);
		
	}

}
