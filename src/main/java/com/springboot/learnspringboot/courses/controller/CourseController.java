package com.springboot.learnspringboot.courses.controller;

import com.springboot.learnspringboot.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(new Course(1, "Learn Microservices2345", "exercise"),
                new Course(2, "Learn Microservices aaaaaaaa", "exercise22345"));
    }

    @GetMapping("/courses/1")
    public List<Course> getCourseDetails() {
        return Arrays.asList(new Course(1, "Learn Microservice erth", "exercise"),
                new Course(2, "Learn Microservices 1", "exercise22345"));
    }
}
