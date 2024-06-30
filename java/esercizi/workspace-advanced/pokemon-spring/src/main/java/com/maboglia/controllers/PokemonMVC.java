package com.maboglia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PokemonMVC {

	@GetMapping("pokepict")
	public String home() {
		return "lista";
	}
	
}
