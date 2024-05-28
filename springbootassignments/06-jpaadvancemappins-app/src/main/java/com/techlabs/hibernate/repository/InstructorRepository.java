package com.techlabs.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techlabs.hibernate.entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Integer>{

}
