package com.techlabs.hibernate.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="instructor")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Instructor {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int instructorId;
	@Column
	private String name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(joinColumns = @JoinColumn(name="instructor_id"),
    inverseJoinColumns = @JoinColumn(name="course_id"))	
	private List<Course> courses;
	

}
