package com.jhonathan.springdatajpa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jhonathan.springdatajpa.models.Student;
import com.jhonathan.springdatajpa.repositories.StudentRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void saveStudent() {
		Student student = studentRepository.findById(1L).orElse(null);
		assertNull(student);

		Student savedStudent = saveTestStudent();
		
		assertNotNull(savedStudent);
		assertEquals("Jhonathan", savedStudent.getName());
		assertEquals(100, savedStudent.getTestScore());
	}

	@Test
	public void updateStudent()
	{
		Student student = saveTestStudent();
		int score = (int)Math.floor(student.getTestScore() * 0.9);
		student.setTestScore(score);
		studentRepository.save(student);

		Student updatedStudent = studentRepository.findById(1L).get();
		assertEquals(score, updatedStudent.getTestScore());
	}

	@Test
	public void deleteStudent()
	{
		Student student = saveTestStudent();
		studentRepository.delete(student);

		Student deletedStudent = studentRepository.findById(1L).orElse(null);
		assertNull(deletedStudent);
	}

	private Student saveTestStudent()
	{
		Student student = new Student();
		student.setId(1L);
		student.setName("Jhonathan");
		student.setTestScore(100);
		studentRepository.save(student);

		return studentRepository.findById(1L).get();
	}
}
