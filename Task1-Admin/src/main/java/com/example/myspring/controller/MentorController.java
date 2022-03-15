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
import com.example.myspring.model.Mentor;
import com.example.myspring.model.Project;
import com.example.myspring.model.ProjectMember;
import com.example.myspring.model.Review;
import com.example.myspring.service.IssueServiceIpml;
import com.example.myspring.service.MentorServiceImpl;
import com.example.myspring.service.PermissionServiceImpl;
import com.example.myspring.service.ProjectMemberSerivceImpl;
import com.example.myspring.service.ProjectServiceImpl;
import com.example.myspring.service.ReviewServiceImpl;

@Controller
public class MentorController {
	@Autowired
	private MentorServiceImpl service;

	@PostMapping("/admin/mentors")
	public String save(Mentor mentor) {
		service.save(mentor);
		return "redirect:/admin/mentor-datatable";
	}

	@GetMapping("/admin/mentors/search")
	public String search(@RequestParam(name = "search") String keyword, Model model) {
		List<Mentor> list = service.search(keyword);
		if (list.isEmpty()) {
			model.addAttribute("message", "Can not find data");
			return "view-admin/mentor_table_list";
		}
		model.addAttribute("listMentors", list);

		return "view-admin/mentor_table_list";
	}

	@PutMapping(value = "/admin/mentors/{id}")
	public String update(@PathVariable String id, Model model) {
		model.addAttribute("mentor", service.findOne(id));
		return "view-admin/mentor-view";
	}

	@DeleteMapping(value = "/admin/mentors/{id}")
	public String delete(@PathVariable String id) {
		service.delete(id);
		return "redirect:/admin/mentor-datatable";
	}

	@GetMapping("/mentor/mentor-dashboard")
	public String viewMentor() {
		return "view-mentor/view-mentor-dashboard";
	}

	// review
	@Autowired
	private ReviewServiceImpl reviewService;

	@GetMapping("/mentor/review-datatable")
	public String reviewDataTable(Model model) {
		model.addAttribute("listReviews", reviewService.findAll());
		return "view-mentor/review_table_list";
	}

	@GetMapping("/mentor/addReview")
	public String reviewIntership(Model model) {
		model.addAttribute("review", new Review());
		return "view-mentor/review_add";
	}

	// project
	@Autowired
	private ProjectServiceImpl projectService;

	@GetMapping("/mentor/project-datatable")
	public String projectDataTable(Model model) {
		model.addAttribute("listProjects", projectService.findAll());
		return "view-mentor/project_table_list";
	}

	@GetMapping("/mentor/addProject")
	public String addProjectByMentor(Model model) {
		model.addAttribute("project", new Project());
		return "view-mentor/project_add";
	}

	// member
	@Autowired
	private ProjectMemberSerivceImpl projectMemberService;

	@GetMapping("/mentor/project-member-datatable")
	public String projectMemberDataTable(Model model) {
		model.addAttribute("listMembers", projectMemberService.findAll());
		return "view-mentor/project_member_table_list";
	}

	@GetMapping("/mentor/addMember")
	public String addMemberByMentor(Model model) {
		model.addAttribute("member", new ProjectMember());
		return "view-mentor/project_member_add";
	}

	// permission
	@Autowired
	private PermissionServiceImpl permissionService;

	@GetMapping("/mentor/permission-datatable")
	public String permissionDataTable(Model model) {
		model.addAttribute("listPermissions", permissionService.findAll());
		return "view-mentor/permission_table_list";
	}

	// issue
	@Autowired
	private IssueServiceIpml issueService;

	@GetMapping("/mentor/issue-datatable")
	public String issueDataTable(Model model) {
		model.addAttribute("listIssues", issueService.findAll());
		return "view-mentor/issue_table_list";
	}

	@GetMapping("/mentor/addIssue")
	public String addIssueByMentor(Model model) {
		model.addAttribute("issue", new Issue());
		return "view-mentor/issue_add";
	}

}
