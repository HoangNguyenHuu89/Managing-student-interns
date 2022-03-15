package com.example.myspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.myspring.model.Mentor;

public interface MentorRepository extends JpaRepository<Mentor, String> {
	
	public List<Mentor> findByIdContaining(String keyword);
}
