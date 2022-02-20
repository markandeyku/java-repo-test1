package com.spring.mvc.SpringMvc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentEntryPoint {
    @GetMapping("/student")
    public String getStudentName(){
        return "Markandey Kumar";
    }
}
