package com.example.session3.modals.repositories;
import com.example.session3.modals.entities.Instructors;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InstructorRepository {
    private final List<Instructors> instructors = new ArrayList<>();

    public InstructorRepository() {
        instructors.add(new Instructors(1L, "Nguyen Van A", "nguyenvana@example.com"));
        instructors.add(new Instructors(2L, "Tran Thi B", "tranthib@example.com"));
    }

    public List<Instructors> findAll() {
        return instructors;
    }
}
