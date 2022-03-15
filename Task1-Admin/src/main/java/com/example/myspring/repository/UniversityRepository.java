package com.example.myspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myspring.model.University;

public interface UniversityRepository extends JpaRepository<University, Integer> {
	List<University> findByNameContaining(String keyword);
}
