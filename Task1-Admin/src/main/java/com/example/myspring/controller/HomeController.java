package com.example.myspring.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/success")
	public void loginPageRedirect(HttpServletRequest request, HttpServletResponse response, Authentication authResult)
			throws IOException, ServletException {

		String role = authResult.getAuthorities().toString();

		if (role.contains("ADMIN")) {
			response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/admin/admin-dashboard"));
		} else if (role.contains("USER")) {
			response.sendRedirect(
					response.encodeRedirectURL(request.getContextPath() + "/intership/intership-dashboard"));
		} else if (role.contains("MENTOR")) {
			response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/mentor/mentor-dashboard"));
		}
	}
}
