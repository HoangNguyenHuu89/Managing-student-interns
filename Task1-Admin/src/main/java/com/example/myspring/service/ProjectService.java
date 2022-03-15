package com.example.myspring.service;

import java.util.List;

import com.example.myspring.model.Project;

public interface ProjectService {
	List<Project> findAll();

	Project findOne(String id);

	void save(Project project);

	void delete(String id);
	
	List<Project> search(String name);
}
