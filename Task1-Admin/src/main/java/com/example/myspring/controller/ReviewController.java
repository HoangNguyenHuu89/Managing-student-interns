package com.example.myspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.myspring.model.Review;
import com.example.myspring.service.ReviewServiceImpl;

@Controller
public class ReviewController {
	@Autowired
	private ReviewServiceImpl service;

	// admin
	@PostMapping("/admin/reviews")
	public String saveByAdmin(Review review) {
		service.save(review);
		return "redirect:/admin/review-datatable";
	}

	@PutMapping(value = "/admin/reviews/{id}")
	public String update(@PathVariable int id, Model model) {
		model.addAttribute("review", service.findOne(id));
		return "view-admin/review-view";
	}

	@DeleteMapping(value = "/admin/reviews/{id}")
	public String delete(@PathVariable int id) {
		service.delete(id);
		return "redirect:/admin/review-datatable";
	}

	// mentor
	@PostMapping("/mentor/reviews")
	public String saveByMentor(Review review) {
		service.save(review);
		return "redirect:/mentor/review-datatable";
	}

	// intership
	@PostMapping("/intership/reviews")
	public String saveByIntership(Review review) {
		service.save(review);
		return "redirect:/intership/review-datatable";
	}

}
