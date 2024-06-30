package com.maboglia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Paese;
import com.maboglia.services.PaeseService;

@RestController
@RequestMapping("api")
public class QuizREST {

	@Autowired
	private PaeseService service;
	
	@GetMapping("paesi")
	List<Paese> getPaesi(){
		return service.getPaesi();
	}
	
	@GetMapping("regioni")
	List<String> getRegioni(){
		return service
				.getPaesi()
				.stream()
				.map(p -> p.getRegion())
				.distinct()
				.sorted()
				.toList()
				;
	}
	
	@GetMapping("paesi/{region}")
	List<Paese> getPaesi(@PathVariable String region){
		return service.getPaesiByRegion(region);
	}
}
