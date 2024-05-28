package com.techlabs.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techlabs.hibernate.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
