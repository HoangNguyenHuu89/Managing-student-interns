package com.example.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myspring.model.UserPosition;
import com.example.myspring.repository.UserPositionRepository;

@Service
public class UserPositionServiceImpl implements UserPositionService {
	@Autowired 
	UserPositionRepository res;

	@Override
	public List<UserPosition> findAll() {
		return res.findAll();
	}

	@Override
	public UserPosition findOne(String id) {
		return res.findById(id).get();
	}

	@Override
	public void save(UserPosition userPosition) {
		res.save(userPosition);
	}
	
	
}
