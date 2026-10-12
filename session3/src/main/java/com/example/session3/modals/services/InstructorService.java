package com.example.session3.modals.services;

import com.example.session3.modals.entities.Instructors;
import com.example.session3.modals.repositories.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {
    private final InstructorRepository instructorRepository;

    @Autowired
    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    public List<Instructors> findAll() {
        return instructorRepository.findAll();
    }
}
