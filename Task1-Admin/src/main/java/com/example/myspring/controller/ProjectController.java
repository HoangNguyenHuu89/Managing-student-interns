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

import com.example.myspring.model.Project;
import com.example.myspring.service.ProjectServiceImpl;

@Controller
public class ProjectController {
	@Autowired
	ProjectServiceImpl service;

	@PostMapping("/mentor/projects")
	public String save(Project project) {
		service.save(project);
		return "redirect:/mentor/project-datatable";
	}

	@GetMapping("/mentor/projects/search")
	public String search(@RequestParam(name = "search") String keyword, Model model) {
		List<Project> list = service.search(keyword);
		if (list.isEmpty()) {
			model.addAttribute("message", "Can not find data");
			return "view-mentor/project_table_list";
		}
		model.addAttribute("listProjects", list);

		return "view-mentor/project_table_list";
	}

	@PutMapping(value = "/mentor/projects/{id}")
	public String update(@PathVariable String id, Model model) {
		model.addAttribute("project", service.findOne(id));
		return "view-mentor/project-view";
	}

	@DeleteMapping(value = "/mentor/projects/{id}")
	public String delete(@PathVariable String id, Model model) {
		service.delete(id);
		return "redirect:/mentor/project-datatable";
	}
}
