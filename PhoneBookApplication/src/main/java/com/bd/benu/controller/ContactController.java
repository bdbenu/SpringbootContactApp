package com.bd.benu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ContactController {

	@GetMapping(value = {"/","/home"})
	public String loadPage() {
		
		
		return"home";
	}
}
