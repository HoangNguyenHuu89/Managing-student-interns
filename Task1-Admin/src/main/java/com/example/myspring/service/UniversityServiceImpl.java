package com.example.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myspring.model.University;
import com.example.myspring.repository.UniversityRepository;

@Service
public class UniversityServiceImpl implements UniversityService {
	@Autowired
	private UniversityRepository res;

	@Override
	public List<University> findAll() {
		return res.findAll();
	}

	@Override
	public University findOne(int id) {
		return res.findById(id).get();
	}

	@Override
	public void save(University university) {
		res.save(university);
		
	}

	@Override
	public void delete(int id) {
		res.deleteById(id);
		
	}

	@Override
	public List<University> search(String keyword) {
		if(keyword != null) {
			return res.findByNameContaining(keyword);
		}
		return res.findAll();
	}
	
	
}
