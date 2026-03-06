package com.example.student_management.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.student_management.dto.StudentDTO;
import com.example.student_management.entity.Student;
import com.example.student_management.repository.StudentRepository;
import com.example.student_management.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository){
        this.repository = repository;
    }

    @Override
    public StudentDTO createStudent(StudentDTO dto){

        Student student = new Student();

        student.setName(dto.getName());
        student.setEmail(dto.getEmail());
        student.setCourse(dto.getCourse());

        Student saved = repository.save(student);

        return new StudentDTO(
                saved.getId(),
                saved.getName(),
                saved.getEmail(),
                saved.getCourse());
    }

    @Override
    public List<StudentDTO> getAllStudents(){

        return repository.findAll()
                .stream()
                .map(s -> new StudentDTO(
                        s.getId(),
                        s.getName(),
                        s.getEmail(),
                        s.getCourse()))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO getStudentById(Long id){

        Student s = repository.findById(id).orElseThrow();

        return new StudentDTO(
                s.getId(),
                s.getName(),
                s.getEmail(),
                s.getCourse());
    }

    @Override
    public StudentDTO updateStudent(Long id,StudentDTO dto){

        Student s = repository.findById(id).orElseThrow();

        s.setName(dto.getName());
        s.setEmail(dto.getEmail());
        s.setCourse(dto.getCourse());

        repository.save(s);

        return dto;
    }

    @Override
    public void deleteStudent(Long id){

        repository.deleteById(id);
    }
}