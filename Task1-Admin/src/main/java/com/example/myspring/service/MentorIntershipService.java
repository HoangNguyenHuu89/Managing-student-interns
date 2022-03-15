package com.example.myspring.service;

import java.util.List;

import com.example.myspring.model.MentorIntership;


public interface MentorIntershipService {
	List<MentorIntership> findAll();

	MentorIntership findOne(int id);

	void save(MentorIntership mentorIntership);

	void delete(int id);
}
