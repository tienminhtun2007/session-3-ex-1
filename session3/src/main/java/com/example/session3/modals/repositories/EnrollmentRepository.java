package com.example.session3.modals.repositories;

import com.example.session3.modals.entities.Enrollment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class EnrollmentRepository {
    private final List<Enrollment> enrollments = new ArrayList<>();

    public EnrollmentRepository() {
        enrollments.add(new Enrollment(1L, "Le Van C", 1L));
        enrollments.add(new Enrollment(2L, "Pham Thi D", 2L));
    }

    public List<Enrollment> findAll() {
        return enrollments;
    }
}
