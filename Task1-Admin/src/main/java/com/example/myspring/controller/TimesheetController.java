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

import com.example.myspring.model.Timesheet;
import com.example.myspring.service.TimesheetServiceImpl;

@Controller
public class TimesheetController {
	@Autowired
	private TimesheetServiceImpl service;

	@PostMapping("/admin/timesheets")
	public String saveByAdmin(Timesheet timesheet) {
		service.save(timesheet);
		return "redirect:/admin/timesheet-datatable";
	}

	@GetMapping("/admin/timesheets/search")
	public String search(@RequestParam(name = "search") String keyword, Model model) {
		List<Timesheet> list = service.search(keyword);
		if (list.isEmpty()) {
			model.addAttribute("message", "Can not find data");
			return "view-admin/timesheet_table_list";
		}
		model.addAttribute("listTimesheets", list);
		return "view-admin/timesheet_table_list";
	}

	@PutMapping(value = "/admin/timesheets/{id}")
	public String update(@PathVariable String id, Model model) {
		model.addAttribute("timesheet", service.findOne(id));
		return "view-admin/timesheet-view";
	}

	@DeleteMapping(value = "/admin/timsheets/{id}")
	public String delete(@PathVariable String id) {
		service.delete(id);
		return "redirect:/admin/timesheet-datatable";
	}

	@PostMapping("/intership/timesheets")
	public String saveByIntership(Timesheet timesheet) {
		service.save(timesheet);
		return "redirect:/intership/timesheet-datatable";
	}

	@GetMapping("/intership/timesheets/search")
	public String searchByIntership(@RequestParam(name = "search") String keyword, Model model) {
		List<Timesheet> list = service.search(keyword);
		if (list.isEmpty()) {
			model.addAttribute("message", "Can not find data");
			return "view-intership/timesheet_table_list";
		}
		model.addAttribute("listTimesheets", list);
		return "view-intership/timesheet_table_list";
	}
}
