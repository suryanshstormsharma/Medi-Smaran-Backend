package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Medicine;

@Repository // Tells Spring Boot this interface manages database operations
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    // That's it! It's completely blank for now.
}