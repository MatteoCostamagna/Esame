package com.maboglia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Router {

	@GetMapping("quiz")
	String home() {
		return "quiz";
	}
}
