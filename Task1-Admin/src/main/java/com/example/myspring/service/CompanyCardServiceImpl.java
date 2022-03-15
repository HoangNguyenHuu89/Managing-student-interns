package com.example.myspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myspring.model.CompanyCard;
import com.example.myspring.repository.CompanyCardRepository;

@Service
public class CompanyCardServiceImpl implements CompanyCardService {
	@Autowired
	private CompanyCardRepository res;
	
	@Override
	public List<CompanyCard> findAll() {
		return res.findAll();
	}

	@Override
	public CompanyCard findOne(String id) {
		return res.findById(id).get();
	}

	@Override
	public void save(CompanyCard companyCard) {
		res.save(companyCard);
		
	}

	@Override
	public void delete(String id) {
		res.deleteById(id);
	}

	@Override
	public List<CompanyCard> search(String keyword) {
		if(keyword != null) {
			return res.findByIdContaining(keyword);
		}
		return res.findAll();
	}

}
