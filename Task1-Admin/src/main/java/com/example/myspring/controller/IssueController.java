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

import com.example.myspring.model.Issue;
import com.example.myspring.service.IssueServiceIpml;

@Controller
public class IssueController {
	@Autowired
	private IssueServiceIpml service;

	@PostMapping("/mentor/issues")
	public String save(Issue issue) {
		service.save(issue);
		return "redirect:/mentor/issue-datatable";
	}

	@GetMapping("/mentor/issues/search")
	public String search(@RequestParam(name = "search") String keyword, Model model) {
		List<Issue> list = service.search(keyword);
		if (list.isEmpty()) {
			model.addAttribute("message", "Can not find data");
			return "view-mentor/issue_table_list";
		}
		model.addAttribute("listIssues", list);

		return "view-mentor/issue_table_list";
	}

	@PutMapping(value = "/mentor/issues/{id}")
	public String update(@PathVariable String id, Model model) {
		model.addAttribute("issue", service.findOne(id));
		return "view-mentor/issue-view";
	}

	@DeleteMapping(value = "/mentor/issues/{id}")
	public String delete(@PathVariable String id, Model model) {
		service.delete(id);
		return "redirect:/mentor/issue-datatable";
	}
}
