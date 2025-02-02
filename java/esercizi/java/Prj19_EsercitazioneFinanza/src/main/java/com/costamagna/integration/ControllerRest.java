package com.costamagna.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.costamagna.services.GlossarioService;

@RestController
public class ControllerRest {
	
	@Autowired
	private GlossarioService service;
	
	@GetMapping("voci")
	public List<String> getVoci(){
		return service.getVoci();
	}
	
}
