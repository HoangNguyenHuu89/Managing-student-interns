package com.example.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myspring.model.Issue;
import com.example.myspring.repository.IssueRepository;

@Service
public class IssueServiceIpml implements IssueService {
	@Autowired
	private IssueRepository res;

	@Override
	public List<Issue> findAll() {
		return res.findAll();
	}

	@Override
	public Issue findOne(String id) {
		return res.findById(id).get();
	}

	@Override
	public void save(Issue issue) {
		res.save(issue);
	}

	@Override
	public void delete(String id) {
		res.deleteById(id);
		
	}

	@Override
	public List<Issue> search(String keyword) {
		if(keyword != null) {
			return res.findByIdContaining(keyword);
		}
		return res.findAll();
	}
	
	
}
