package com.example.student_management.controller;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.student_management.dto.StudentDTO;
import com.example.student_management.service.StudentService;

@RestController
@RequestMapping("/api/students")

public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service){
        this.service = service;
    }

    @PostMapping
    public StudentDTO create(@RequestBody StudentDTO dto){

        return service.createStudent(dto);
    }

    @GetMapping
    public List<StudentDTO> getAll(){

        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDTO get(@PathVariable Long id){

        return service.getStudentById(id);
    }

    @PutMapping("/{id}")
    public StudentDTO update(@PathVariable Long id,
                             @RequestBody StudentDTO dto){

        return service.updateStudent(id,dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){

        service.deleteStudent(id);

        return "Deleted successfully";
    }
}