package com.app.service;

import java.util.List;

import com.app.bean.Student;

public interface IStudentService {

	public int saveStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int sid);
	public Student getStudent(int sid);
	public List<Student>  getAllStudent();
	
	
	
	
}
