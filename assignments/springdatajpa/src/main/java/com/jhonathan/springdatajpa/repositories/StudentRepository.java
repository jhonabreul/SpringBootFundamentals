package com.jhonathan.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhonathan.springdatajpa.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
