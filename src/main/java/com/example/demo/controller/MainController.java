package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
	public class MainController {
		@Value("${welcome.message}")
		private String message;

		@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
		public String index(Model model) {
			List<Phone> lp = new ArrayList<>();
			lp.add(new Phone("Алехандро", "45454545"));
			lp.add(new Phone("Богомол", "488484"));
			model.addAttribute("message", message);
			model.addAttribute("phones", lp);
			return "index";
	}
}