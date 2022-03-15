package com.example.myspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.myspring.model.CompanyCard;
import com.example.myspring.model.Intership;
import com.example.myspring.model.Mentor;
import com.example.myspring.model.MentorIntership;
import com.example.myspring.model.Position;
import com.example.myspring.model.Review;
import com.example.myspring.model.Timesheet;
import com.example.myspring.model.University;
import com.example.myspring.model.UserPosition;
import com.example.myspring.service.CompanyCardServiceImpl;
import com.example.myspring.service.IntershipServiceImpl;
import com.example.myspring.service.MentorIntershipServiceImpl;
import com.example.myspring.service.MentorServiceImpl;
import com.example.myspring.service.PositionServiceImpl;
import com.example.myspring.service.ReviewServiceImpl;
import com.example.myspring.service.TimesheetServiceImpl;
import com.example.myspring.service.UniversityServiceImpl;
import com.example.myspring.service.UserPositionServiceImpl;

@Controller
public class AdminController {

	@GetMapping("/admin/admin-dashboard")
	public String view() {
		return "view-admin/view-admin-dashboard";
	}

	// mentor
	@Autowired
	private MentorServiceImpl mentorSerivce;

	@GetMapping("/admin/mentor-datatable")
	public String mentorDataTable(Model model) {
		model.addAttribute("listMentors", mentorSerivce.findAll());
		return "view-admin/mentor_table_list";
	}

	@GetMapping("/admin/addMentor")
	public String addMentorByAdmin(Model model) {
		model.addAttribute("mentor", new Mentor());
		return "view-admin/mentor_add";
	}

	@Autowired
	private MentorIntershipServiceImpl mentorIntershipService;

	@GetMapping("/admin/assign-intership-datatable")
	public String assignIntershipDataTable(Model model) {
		model.addAttribute("listAssigns", mentorIntershipService.findAll());
		return "view-admin/assign_table_list";
	}

	@GetMapping("/admin/assign-intership")
	public String assignIntershipByAdmin(Model model) {
		model.addAttribute("assign", new MentorIntership());
		return "view-admin/assign-intership";
	}

	// intership
	@Autowired
	private IntershipServiceImpl intershipService;

	@GetMapping("/admin/intership-datatable")
	public String intershipDataTable(Model model) {
		model.addAttribute("listInterships", intershipService.findAll());
		return "view-admin/intership_table_list";
	}

	@GetMapping("/admin/addIntership")
	public String addIntershipByAdmin(Model model) {
		model.addAttribute("intership", new Intership());
		return "view-admin/intership_add";
	}

	// review
	@Autowired
	private ReviewServiceImpl reviewService;

	@GetMapping("/admin/review-datatable")
	public String reviewDataTable(Model model) {
		model.addAttribute("reviewList", reviewService.findAll());
		return "view-admin/review_table_list";
	}

	@GetMapping("/admin/addReview")
	public String reviewIntershipByAdmin(Model model) {
		model.addAttribute("review", new Review());
		return "view-admin/review_add";
	}

	// timesheet
	@Autowired
	private TimesheetServiceImpl timesheetService;

	@GetMapping("/admin/timesheet-datatable")
	public String timesheetDataTable(Model model) {
		model.addAttribute("listTimesheets", timesheetService.findAll());
		return "view-admin/timesheet_table_list";
	}

	@GetMapping("/admin/addTimesheet")
	public String addTimesheetByAdmin(Model model) {
		model.addAttribute("timesheet", new Timesheet());
		return "view-admin/timesheet_add";
	}

	// university
	@Autowired
	private UniversityServiceImpl universitySerivce;

	@GetMapping("/admin/university-datatable")
	public String universityDataTable(Model model) {
		model.addAttribute("listUniversitys", universitySerivce.findAll());
		return "view-admin/university_table_list";
	}

	@GetMapping("/admin/addUniversity")
	public String addUniversityByAdmin(Model model) {
		model.addAttribute("university", new University());
		return "view-admin/university_add";
	}

	// companycard
	@Autowired
	private CompanyCardServiceImpl companyCardService;

	@GetMapping("/admin/comapany-card-datatable")
	public String companyCardDataTable(Model model) {
		model.addAttribute("companyCardLists", companyCardService.findAll());
		return "view-admin/company_card_table_list";
	}

	@GetMapping("/admin/addCompanyCard")
	public String addCompanyCardByAdmin(Model model) {
		model.addAttribute("companyCard", new CompanyCard());
		return "view-admin/companycard_add";
	}

	// position
	@Autowired
	private PositionServiceImpl positionSevice;

	@GetMapping("/admin/position-datatable")
	public String positionDataTable(Model model) {
		model.addAttribute("positionLists", positionSevice.findAll());
		return "view-admin/position_table_list";
	}

	@GetMapping("/admin/addPosition")
	public String addPositionByAdmin(Model model) {
		model.addAttribute("position", new Position());
		return "view-admin/position_add";
	}

	// user postion

	@Autowired
	private UserPositionServiceImpl userPositionService;

	@GetMapping("/admin/user-position-datatable")
	public String userPositionDataTable(Model model) {
		model.addAttribute("userPositionLists", userPositionService.findAll());
		return "view-admin/user_position_table_list";
	}

	@GetMapping("/admin/addUserPosition")
	public String addUserPositionByAdmin(Model model) {
		model.addAttribute("userPosition", new UserPosition());
		return "view-admin/user_position_add";
	}

}
