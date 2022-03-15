package com.example.myspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myspring.model.Intership;


public interface IntershipRepository extends JpaRepository<Intership, String> {
	public List<Intership> findByIdContaining(String keyword);
}
