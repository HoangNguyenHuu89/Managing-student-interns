package com.example.myspring.service;

import java.util.List;


import com.example.myspring.model.UserPosition;

public interface UserPositionService {
	List<UserPosition> findAll();
	
	void save(UserPosition userPosition);

	UserPosition findOne(String id);
}
