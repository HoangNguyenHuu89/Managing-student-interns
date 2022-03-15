package com.example.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myspring.model.Project;
import com.example.myspring.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	ProjectRepository res;
	
	@Override
	public List<Project> findAll() {
		return res.findAll();
	}

	@Override
	public Project findOne(String id) {
		return res.findById(id).get();
	}

	@Override
	public void save(Project project) {
		res.save(project);
	}

	@Override
	public void delete(String id) {
		res.deleteById(id);
	}

	@Override
	public List<Project> search(String name) {
		if(name != null) {
			return res.findByNameContaining(name);
		}
		return res.findAll();
	}

}
