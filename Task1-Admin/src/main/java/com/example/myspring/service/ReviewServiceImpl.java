package com.example.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myspring.model.Review;
import com.example.myspring.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ReviewRepository res;

	@Override
	public List<Review> findAll() {
		return res.findAll();
	}

	@Override
	public Review findOne(int id) {
		return res.findById(id).get();
	}

	@Override
	public void save(Review review) {
		res.save(review);
	}

	@Override
	public void delete(int id) {
		res.deleteById(id);
	}
}
