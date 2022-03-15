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

import com.example.myspring.model.Intership;
import com.example.myspring.model.Review;
import com.example.myspring.model.Timesheet;
import com.example.myspring.service.IntershipServiceImpl;
import com.example.myspring.service.ReviewServiceImpl;
import com.example.myspring.service.TimesheetServiceImpl;

@Controller
public class IntershipController {
	@Autowired
	private IntershipServiceImpl service;

	@PostMapping("/admin/interships")
	public String saveIntersip(Intership intership) {
		service.save(intership);
		return "redirect:/admin/intership-datatable";
	}

	@GetMapping("/admin/interships/search")
	public String searchBy(@RequestParam(name = "search") String keyword, Model model) {
		List<Intership> list = service.search(keyword);
		if (list.isEmpty()) {
			model.addAttribute("message", "Can not find data");
			return "view-admin/intership_table_list";
		}
		model.addAttribute("listInterships", list);

		return "view-admin/intership_table_list";
	}

	@PutMapping(value = "/admin/interships/{id}")
	public String update(@PathVariable String id, Model model) {
		model.addAttribute("intership", service.findOne(id));
		return "view-admin/intership-view";
	}

	@DeleteMapping(value = "/admin/interships/{id}")
	public String delete(@PathVariable String id) {
		service.delete(id);
		return "redirect:/admin/intership-datatable";
	}

	@GetMapping("/intership/intership-dashboard")
	public String view() {
		return "view-intership/view-intership-dashboard";
	}

	// timesheet
	@Autowired
	private TimesheetServiceImpl timesheetService;

	@GetMapping("/intership/timesheet-datatable")
	public String timesheetDataTable(Model model) {
		model.addAttribute("listTimesheets", timesheetService.findAll());
		return "view-intership/timesheet_table_list";
	}

	@GetMapping("/intership/registration")
	public String timesheetRegistration(Model model) {
		model.addAttribute("timesheet", new Timesheet());
		return "view-intership/timesheet_registration";
	}

	// review
	@Autowired
	private ReviewServiceImpl reviewService;

	@GetMapping("/intership/review-datatable")
	public String reviewDataTable(Model model) {
		model.addAttribute("reviewList", reviewService.findAll());
		return "view-intership/review_table_list";
	}

	@GetMapping("/intership/review-mentor")
	public String addReview(Model model) {
		model.addAttribute("review", new Review());
		return "view-intership/review_add";
	}

}
