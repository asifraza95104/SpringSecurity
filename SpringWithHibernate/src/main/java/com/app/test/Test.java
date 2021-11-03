package com.app.test;

import java.util.List;
import java.util.ListIterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.Student;
import com.app.config.AppConfig;
import com.app.service.IStudentService;
import com.app.service.StudentServiceImpl;

public class Test {

	
	 public static void main(String[] args) {
		
		 ApplicationContext context = 
				  new AnnotationConfigApplicationContext(AppConfig.class);
		 IStudentService stuentService = 
				  (IStudentService)context.getBean("studentServiceImpl");
		 
		 
		/*
		 * Student student = new Student(); student.setSid(5);
		 * student.setSname("farzana"); student.setSfee("500");
		 * student.setSaddr("bara");
		 * 
		 * int i= stuentService.saveStudent(student); System.out.println( i+
		 * " record inseted in db");
		 */
		 
		/*
		 * Student student = new Student();
		 * 
		 * student.setSid(1); student.setSaddr("hyderabad"); student.setSfee("1000");
		 * student.setSname("saifullah");
		 * 
		 * stuentService.updateStudent(student);
		 * System.out.println("record successfully updated");
		 */
		 
		List<Student> student_list= stuentService.getAllStudent();
		 
		//System.out.println(student_list);
		
		ListIterator<Student> student_list_iterator=
				  student_list.listIterator();
		while(student_list_iterator.hasNext())
		{
			 Student student = (Student)student_list_iterator.next();
			 System.out.println(student);
		}
		 
		 
		//Student s = new Student();
		//s.setSid(1);
		stuentService.deleteStudent(1);
		
		System.out.println("record Successfully deleted ");
		
		List<Student> student_list1= stuentService.getAllStudent();
		 
		//System.out.println(student_list);
		
		ListIterator<Student> student_list_iterator1=
				  student_list.listIterator();
		while(student_list_iterator1.hasNext())
		{
			 Student student = (Student)student_list_iterator1.next();
			 System.out.println(student);
		}
		 
		 
		 
		 
	}
}
