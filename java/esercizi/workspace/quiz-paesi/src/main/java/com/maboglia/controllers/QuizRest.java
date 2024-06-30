package com.maboglia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Paese;
import com.maboglia.services.QuizService;

@RestController
@RequestMapping("api")
public class QuizRest {

	@Autowired
	private QuizService service;
	
	@GetMapping("paesi/all")
	public ResponseEntity<List<Paese>> getPaesi(){
		return new ResponseEntity<>(service.getPaesiRandom(90), HttpStatus.OK);
	}
	
	@GetMapping("paesi")
	public ResponseEntity<List<Paese>> getPaesiRandom(){
		return new ResponseEntity<>(service.getPaesiRandom(3), HttpStatus.OK);
	}
	
	@GetMapping("paese")
	public ResponseEntity<List<Paese>> getPaeseRandom(){
		return new ResponseEntity<>(service.getPaesiRandom(1), HttpStatus.OK);
	}	
}
