package com.costamagna.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.costamagna.entities.Bollettino;
import com.costamagna.entities.ContoCorrente;
import com.costamagna.services.BollettinoServices;

@RestController
public class ControllerREST {
	
	@Autowired
	private BollettinoServices services;
	
	@GetMapping("conti")
	public List<ContoCorrente> getContiCorr(){
		List<ContoCorrente> c =  services.getContiCorr();
		return c; 	
	}
	
	
	@GetMapping("conti/{codice}")
	public ContoCorrente getContoByCod(@PathVariable("codice") int cod){
		ContoCorrente c2= services.getContoByCod(cod);
		return c2;
	}
	
	@PostMapping("conti")
	 public ContoCorrente addContiCorr(@RequestBody ContoCorrente c) {
		ContoCorrente c3 = services.addContiCorr(c);
		return c3;	    
	    }
	
	@GetMapping("bollettini")
	public List<Bollettino> getBollettini(){
		List<Bollettino> b = services.getBollettini();
		return b;
	}
	
	@GetMapping("bollettini/{id}")
	public Bollettino getBollettinoById(int id){
		Bollettino b2 = services.getBollettinoById(id);
		return b2;
	}
	@GetMapping("bollettini/{idUtente}")
	public Bollettino getBollettinoByIdUtente(int idUtente){
		Bollettino b3 = services.getBollettinoByUtente(idUtente);
		return b3;
	}
	@PostMapping("bollettini")
	public Bollettino addBollettino(@RequestBody Bollettino b){
		Bollettino b4 = services.addBollettino(b);
		return b4;
	}
	
	
	
}
