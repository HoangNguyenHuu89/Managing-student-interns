package com.example.myspring.service;

import java.util.List;

import com.example.myspring.model.Position;

public interface PositionService {
	List<Position> findAll();

	Position findOne(String id);

	void save(Position position);

	void delete(String id);
	
	List<Position> search(String keyword);
}
