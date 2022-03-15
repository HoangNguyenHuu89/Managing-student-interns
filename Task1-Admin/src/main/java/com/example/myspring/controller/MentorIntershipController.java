package com.example.myspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.myspring.model.MentorIntership;
import com.example.myspring.service.MentorIntershipServiceImpl;

@Controller
public class MentorIntershipController {
	@Autowired
	private MentorIntershipServiceImpl service;

	@PostMapping("/admin/assign-intership")
	private String assignIntership(MentorIntership mentorIntership) {
		service.save(mentorIntership);
		return "redirect:/admin/assign-intership-datatable";
	}

}
