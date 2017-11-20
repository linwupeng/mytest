package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/user")
	public String user(Model model){
		model.addAttribute("users", new String[]{"张三","李四","王五"});
		return "user";
	}
}
