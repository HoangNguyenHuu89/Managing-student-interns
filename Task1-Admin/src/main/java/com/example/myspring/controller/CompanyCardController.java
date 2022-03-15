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

import com.example.myspring.model.CompanyCard;
import com.example.myspring.service.CompanyCardServiceImpl;

@Controller
public class CompanyCardController {
	@Autowired
	private CompanyCardServiceImpl service;

	@PostMapping("/admin/companycards")
	public String save(CompanyCard companyCard) {
		service.save(companyCard);
		return "redirect:/admin/comapany-card-datatable";
	}

	@GetMapping("/admin/companycards/search")
	public String search(@RequestParam(name = "search") String keyword, Model model) {
		List<CompanyCard> list = service.search(keyword);
		if (list.isEmpty()) {
			model.addAttribute("message", "Can not find data");
			return "view-admin/company_card_table_list";
		}
		model.addAttribute("companyCardLists", list);
		return "view-admin/company_card_table_list";
	}

	@PutMapping(value = "/admin/companycards/{id}")
	public String update(@PathVariable String id, Model model) {
		model.addAttribute("companyCard", service.findOne(id));
		return "view-admin/company-card-view";
	}

	@DeleteMapping(value = "/admin/companycards/{id}")
	public String delete(@PathVariable String id) {
		service.delete(id);
		return "redirect:/admin/comapany-card-datatable";
	}
}
