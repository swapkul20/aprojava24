package com.techlabs.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techlabs.hibernate.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{


}
