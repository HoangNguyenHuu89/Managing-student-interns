package com.example.myspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myspring.model.ProjectMember;

public interface ProjectMemberRepository extends JpaRepository<ProjectMember, String>{
	List<ProjectMember> findByUserIdContaining(String keyword);
}
