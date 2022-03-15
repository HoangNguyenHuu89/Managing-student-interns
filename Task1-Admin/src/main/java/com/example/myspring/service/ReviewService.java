package com.example.myspring.service;

import java.util.List;

import com.example.myspring.model.Review;

public interface ReviewService {
	List<Review> findAll();

	Review findOne(int id);

	void save(Review review);

	void delete(int id);
}
