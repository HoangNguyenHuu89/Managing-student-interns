package com.example.myspring.service;

import java.util.List;

import com.example.myspring.model.Mentor;


public interface MentorService {
	List<Mentor> findAll();

	Mentor findOne(String id);

	void save(Mentor mentor);

	void delete(String id);
	
	List<Mentor> search(String id);
}
