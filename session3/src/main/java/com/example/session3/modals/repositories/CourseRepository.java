package com.example.session3.modals.repositories;

import com.example.session3.modals.entities.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CourseRepository {
    private final List<Course> courses = new ArrayList<>();

    public CourseRepository() {
        courses.add(new Course(1L, "Lap trinh Java Co ban", "ACTIVE", 1L));
        courses.add(new Course(2L, "Spring Boot Web Development", "PENDING", 2L));
    }

    public List<Course> findAll() {
        return courses;
    }
}
