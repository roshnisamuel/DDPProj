package com.ddp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DDPController {

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");

		return "hello";
	}
}
