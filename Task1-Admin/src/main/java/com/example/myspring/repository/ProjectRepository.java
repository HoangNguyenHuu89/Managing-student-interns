package com.example.myspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myspring.model.Project;

public interface ProjectRepository extends JpaRepository<Project, String> {
	List<Project> findByNameContaining(String keyword);
}
