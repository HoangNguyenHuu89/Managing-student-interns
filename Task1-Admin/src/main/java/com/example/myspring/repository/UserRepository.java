package com.example.myspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myspring.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
