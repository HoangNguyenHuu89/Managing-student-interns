package com.example.myspring.service;

import java.util.List;


import com.example.myspring.model.University;

public interface UniversityService {
	List<University> findAll();

	University findOne(int id);

	void save(University university);

	void delete(int id);
	
	List<University> search(String keyword);
}
