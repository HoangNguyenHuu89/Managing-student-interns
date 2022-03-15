package com.example.myspring.service;

import java.util.List;

import com.example.myspring.model.Issue;

public interface IssueService {
	List<Issue> findAll();
	
	Issue findOne(String id);
	
	void save(Issue issue);
	
	void delete(String id);
	
	List<Issue> search(String keyword);
}
