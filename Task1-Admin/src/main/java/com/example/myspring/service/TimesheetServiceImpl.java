package com.example.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myspring.model.Timesheet;
import com.example.myspring.repository.TimesheetRepository;

@Service
public class TimesheetServiceImpl implements TimesheetService {
	@Autowired
	private TimesheetRepository res;

	@Override
	public List<Timesheet> findAll() {
		return res.findAll();
	}

	@Override
	public Timesheet findOne(String id) {
		// TODO Auto-generated method stub
		return res.findById(id).get();
	}

	@Override
	public void save(Timesheet timesheet) {
		res.save(timesheet);
	}

	@Override
	public void delete(String id) {
		res.deleteById(id);
	}

	@Override
	public List<Timesheet> search(String keyword) {
		if(keyword != null) {
			return res.findByIdContaining(keyword);
		}
		return res.findAll();
	}
	
	
		
}
