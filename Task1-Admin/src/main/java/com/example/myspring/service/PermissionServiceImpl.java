package com.example.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myspring.model.Permission;
import com.example.myspring.repository.PermissionrRepository;

@Service
public class PermissionServiceImpl implements PermissionService {
	@Autowired
	PermissionrRepository res;

	@Override
	public List<Permission> findAll() {
		return res.findAll();
	}
}
