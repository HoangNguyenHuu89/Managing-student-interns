package com.example.myspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myspring.model.CompanyCard;

public interface CompanyCardRepository extends JpaRepository<CompanyCard, String> {
	public List<CompanyCard> findByIdContaining(String keyword);
}
