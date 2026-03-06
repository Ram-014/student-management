package com.example.student_management.exception;

public class ResourceNotFoundException
        extends RuntimeException{

    public ResourceNotFoundException(String msg){

        super(msg);
    }
}