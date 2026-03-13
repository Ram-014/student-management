package com.example.student_management.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentDTO {

    private Long id;

    private String name;

    private String email;

    private String course;
}
