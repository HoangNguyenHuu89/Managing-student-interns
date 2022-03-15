package com.example.myspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.myspring.model.UserPosition;
import com.example.myspring.service.UserPositionServiceImpl;

@Controller
public class UserPositionController {
	@Autowired
	UserPositionServiceImpl service;

	@PostMapping("/admin/user-positions")
	public String save(UserPosition position) {
		service.save(position);
		return "redirect:/admin/user-position-datatable";
	}

	@PutMapping(value = "/admin/user-positions/{id}")
	public String update(@PathVariable String id, Model model) {
		model.addAttribute("userPosition", service.findOne(id));
		return "view-admin/user-position-view";
	}
}
