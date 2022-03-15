package com.example.myspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myspring.model.Timesheet;

public interface TimesheetRepository extends JpaRepository<Timesheet, String> {
	List<Timesheet> findByIdContaining(String keyword);
}
