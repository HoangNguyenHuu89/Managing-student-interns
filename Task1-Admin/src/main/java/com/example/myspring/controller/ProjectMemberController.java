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

import com.example.myspring.model.ProjectMember;
import com.example.myspring.service.ProjectMemberSerivceImpl;

@Controller
public class ProjectMemberController {
	@Autowired
	private ProjectMemberSerivceImpl service;

	@PostMapping("/mentor/members")
	public String save(ProjectMember member) {
		service.save(member);
		return "redirect:/mentor/project-member-datatable";
	}

	@GetMapping("/mentor/members/search")
	public String search(@RequestParam(name = "search") String keyword, Model model) {
		List<ProjectMember> list = service.search(keyword);
		if (list.isEmpty()) {
			model.addAttribute("message", "Can not find data");
			return "view-mentor/project_member_table_list";
		}
		model.addAttribute("listMembers", list);

		return "view-mentor/project_member_table_list";
	}

	@PutMapping(value = "/mentor/members/{id}")
	public String update(@PathVariable String id, Model model) {
		model.addAttribute("member", service.findOne(id));
		return "view-mentor/project-member-view";
	}

	@DeleteMapping(value = "/mentor/members/{id}")
	public String delete(@PathVariable String id, Model model) {
		service.delete(id);
		return "redirect:/mentor/project-member-datatable";
	}

}
