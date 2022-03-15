package com.example.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myspring.model.Intership;
import com.example.myspring.repository.IntershipRepository;

@Service
public class IntershipServiceImpl implements IntershipService {
	@Autowired
	private IntershipRepository res;
	
	@Override
	public List<Intership> findAll() {
		return res.findAll();
	}

	@Override
	public Intership findOne(String id) {
		return res.findById(id).get();
	}

	@Override
	public void save(Intership intership) {
		res.save(intership);
		
	}

	@Override
	public void delete(String id) {
		res.deleteById(id);
		
	}

	@Override
	public List<Intership> search(String keyword) {
		if(keyword != null) {
			return res.findByIdContaining(keyword);
		}
		return res.findAll();
	}

}
