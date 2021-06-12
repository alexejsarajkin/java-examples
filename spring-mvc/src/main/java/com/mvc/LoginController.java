package com.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/", method = GET)
	@ResponseBody
	public String hello() {
		return "Hello world";
	}

	@RequestMapping(value = "/login", method = GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = POST)
	public String handleUserLogin(
			ModelMap model,
			@RequestParam String name,
			@RequestParam String password
	) {

		if (!loginService.validateUser(name, password)) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}

		model.put("name", name);
		return "welcome";
	}
}
