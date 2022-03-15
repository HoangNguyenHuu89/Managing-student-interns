package com.example.myspring.service;

import java.util.List;

import com.example.myspring.model.Intership;


public interface IntershipService {
	List<Intership> findAll();

	Intership findOne(String id);

	void save(Intership intership);

	void delete(String id);
	
	List<Intership> search(String keyword);
}
