package com.cg.jpacrud.dao;

import javax.persistence.EntityManager;
import com.cg.jpacrud.entities.Student;

public class StudentDaoImpl implements StudentDao
{
	private EntityManager entityManager;
	
	public StudentDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Student getStudentById(int id) 
	{
		// TODO Auto-generated method stub
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public void addStudent(Student student) 
	{
		// TODO Auto-generated method stub
		entityManager.persist(student);
	}

	@Override
	public void removeStudent(Student student) 
	{
		// TODO Auto-generated method stub
		entityManager.remove(student);
	}

	@Override
	public void updateStudent(Student student) 
	{
		// TODO Auto-generated method stub
		entityManager.merge(student);
	}

	@Override
	public void commitTrasaction() 
	{
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}

	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
	}
}