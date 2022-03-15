package com.example.myspring.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.example.myspring.model.MentorIntership;

import com.example.myspring.repository.MentorIntershipRepository;

@Service
public class MentorIntershipServiceImpl implements MentorIntershipService {
	@Autowired
	private MentorIntershipRepository res;

	@Override
	public List<MentorIntership> findAll() {
		return res.findAll();
	}

	@Override
	public MentorIntership findOne(int id) {
		return res.findById(id).get();
	}

	@Override
	public void save(MentorIntership mentorIntership) {
		res.save(mentorIntership);
	}

	@Override
	public void delete(int id) {
		res.deleteById(id);
	}

	

	

	
	
}
