package com.example.myspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.myspring.model.University;
import com.example.myspring.service.UniversityServiceImpl;

@Controller
public class UniversityController {
	@Autowired
	private UniversityServiceImpl service;

	@PostMapping("/admin/universitys")
	public String save(University university) {
		service.save(university);
		return "redirect:/admin/university-datatable";
	}

	@GetMapping("/admin/universitys/search")
	public String search(@RequestParam(name = "search") String keyword, Model model) {
		List<University> list = service.search(keyword);
		if (list.isEmpty()) {
			model.addAttribute("message", "Can not find data");
			return "view-admin/university_table_list";
		}
		model.addAttribute("listUniversitys", list);
		return "view-admin/university_table_list";
	}

	@PutMapping(value = "/admin/universitys/{id}")
	public String update(@PathVariable int id, Model model) {
		model.addAttribute("university", service.findOne(id));
		return "view-admin/university-view";
	}

	@DeleteMapping(value = "/admin/universitys/{id}")
	public String delete(@PathVariable int id) {
		service.delete(id);
		return "redirect:/admin/university-datatable";
	}

}
