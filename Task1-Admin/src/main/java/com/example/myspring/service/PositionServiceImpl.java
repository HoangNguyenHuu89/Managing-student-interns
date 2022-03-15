package com.example.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myspring.model.Position;
import com.example.myspring.repository.PositionRepository;

@Service
public class PositionServiceImpl implements PositionService {
	@Autowired
	private PositionRepository res;
	
	
	@Override
	public List<Position> findAll() {
		return res.findAll();
	}

	@Override
	public Position findOne(String id) {
		return res.findById(id).get();
	}

	@Override
	public void save(Position position) {
		res.save(position);
	}

	@Override
	public void delete(String id) {
		res.deleteById(id);
	}

	@Override
	public List<Position> search(String keyword) {
		if(keyword != null) {
			return res.findByNameContaining(keyword);
		}
		return res.findAll();
	}

}
