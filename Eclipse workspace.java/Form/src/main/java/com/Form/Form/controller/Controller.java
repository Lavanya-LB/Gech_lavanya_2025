package com.Form.Form.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping({"/add-student"})
	public String home() {
		return "add_student";
	}

}
