package com.example.myspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myspring.model.Issue;

public interface IssueRepository extends JpaRepository<Issue, String>  {
	List<Issue> findByIdContaining(String keyword);
}
