package com.example.myspring.service;

import java.util.List;

import com.example.myspring.model.ProjectMember;

public interface ProjectMemberSerivce {
	List<ProjectMember> findAll();

	ProjectMember findOne(String id);

	void save(ProjectMember member);

	void delete(String id);
	
	List<ProjectMember> search(String keyword);
}
