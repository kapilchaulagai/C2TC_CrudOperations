package com.cg.jpacrud.client;

import com.cg.jpacrud.entities.Student;
import com.cg.jpacrud.service.StudentService;
import com.cg.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService service = new StudentServiceImpl();
		
		Student student = new Student();
		
		// Create Operation
		student.setStudentId(100);
		student.setName("Sachin");
		service.addStudent(student);
		
		//at this breakpoint, we have added one record to table
		// Retrieve Operation
		student = service.findStudentById(100);
		System.out.println("ID: "+student.getStudentId());
		System.out.println("Name: "+student.getName());
		
		// Update Operation
		student = service.findStudentById(100);
		student.setName("Sachin Tendulkar");
		service.updateStudent(student);
		
		//at this breakpoint, we have updated record added in first section
		student = service.findStudentById(100);
		System.out.println("ID: "+student.getStudentId());
		System.out.println("Name: "+student.getName());
		
		//at this breakpoint, record is removed from table
		// Delete Operation
//		student = service.findStudentById(100);
//		service.removeStudent(student);
		System.out.println("End of Program/Life cycle completed...");
	}

}
