package net.project.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.project.sms.entity.Student;
import net.project.sms.repository.StudentRepository;
import net.project.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{
	private StudentRepository studentRepository;
	public StudentServiceImpl(StudentRepository studentRepository)
	{
		super();
		this.studentRepository=studentRepository;
	}
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}
/*
@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}*/