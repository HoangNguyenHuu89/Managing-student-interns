package com.example.myspring.service;

import java.util.List;


import com.example.myspring.model.Timesheet;

public interface TimesheetService {
	List<Timesheet> findAll();

	Timesheet findOne(String id);

	void save(Timesheet timesheet);

	void delete(String id);
	
	List<Timesheet> search(String keyword);
}
