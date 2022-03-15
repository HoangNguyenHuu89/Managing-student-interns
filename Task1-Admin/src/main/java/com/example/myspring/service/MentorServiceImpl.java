package com.example.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myspring.model.Mentor;
import com.example.myspring.repository.MentorRepository;

@Service
public class MentorServiceImpl implements MentorService {
	@Autowired
	private MentorRepository res;
	
	@Override
	public List<Mentor> findAll() {
		return res.findAll();
	}

	@Override
	public Mentor findOne(String id) {
		return res.findById(id).get();
	}

	@Override
	public void save(Mentor mentor) {
		res.save(mentor);
	}

	@Override
	public void delete(String id) {
		res.deleteById(id);;
	}

	@Override
	public List<Mentor> search(String id) {
		if(id != null) {
			return res.findByIdContaining(id);
		}
		return res.findAll();
	}

}
