package com.cg.jpacrud.service;

import com.cg.jpacrud.dao.StudentDao;
import com.cg.jpacrud.dao.StudentDaoImpl;
import com.cg.jpacrud.entities.Student;

public class StudentServiceImpl implements StudentService
{
	private StudentDao dao;
	
	public StudentServiceImpl()
	{
		dao = new StudentDaoImpl();
	}

	@Override
	public void addStudent(Student student) 
	{
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTrasaction();
	}

	@Override
	public void updateStudent(Student student) 
	{
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTrasaction();
	}

	@Override
	public void removeStudent(Student student) 
	{
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTrasaction();
	}

	@Override
	public Student findStudentById(int id) 
	{
		// TODO Auto-generated method stub
		Student student = dao.getStudentById(id);
		return student;
	}
	
}
