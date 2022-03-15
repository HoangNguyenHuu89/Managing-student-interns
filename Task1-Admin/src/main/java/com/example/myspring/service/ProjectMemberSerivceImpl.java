package com.example.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myspring.model.ProjectMember;
import com.example.myspring.repository.ProjectMemberRepository;

@Service
public class ProjectMemberSerivceImpl implements ProjectMemberSerivce {
	@Autowired
	ProjectMemberRepository res;
	
	@Override
	public List<ProjectMember> findAll() {
		return res.findAll();
	}

	@Override
	public ProjectMember findOne(String id) {
		return res.findById(id).get();
	}

	@Override
	public void save(ProjectMember member) {
		res.save(member);
	}

	@Override
	public void delete(String id) {
		res.deleteById(id);	
	}

	@Override
	public List<ProjectMember> search(String keyword) {
		if(keyword != null) {
			return res.findByUserIdContaining(keyword);
		}
		return res.findAll();
	}

}
