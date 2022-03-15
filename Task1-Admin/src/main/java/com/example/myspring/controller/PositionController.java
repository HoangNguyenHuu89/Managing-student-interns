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

import com.example.myspring.model.Position;
import com.example.myspring.service.PositionServiceImpl;

@Controller
public class PositionController {
	@Autowired
	private PositionServiceImpl service;

	@PostMapping("/admin/positions")
	public String save(Position position) {
		service.save(position);
		return "redirect:/admin/position-datatable";
	}

	@GetMapping("/admin/positions/search")
	public String search(@RequestParam(name = "search") String keyword, Model model) {
		List<Position> list = service.search(keyword);
		if (list.isEmpty()) {
			model.addAttribute("message", "Can not find data");
			return "view-admin/position_table_list";
		}
		model.addAttribute("positionLists", list);

		return "view-admin/position_table_list";
	}

	@PutMapping(value = "/admin/positions/{id}")
	public String update(@PathVariable String id, Model model) {
		model.addAttribute("position", service.findOne(id));
		return "view-admin/position-view";
	}

	@DeleteMapping(value = "/admin/positions/{id}")
	public String delete(@PathVariable String id) {
		service.delete(id);
		return "redirect:/admin/position-datatable";
	}

}
