package com.example.myspring.service;

import java.util.List;

import com.example.myspring.model.CompanyCard;

public interface CompanyCardService {
	List<CompanyCard> findAll();

	CompanyCard findOne(String id);

	void save(CompanyCard companyCard);

	void delete(String id);
	
	List<CompanyCard> search(String keyword);
}
