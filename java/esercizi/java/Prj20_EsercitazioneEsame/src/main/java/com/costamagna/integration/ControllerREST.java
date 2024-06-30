package com.costamagna.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.costamagna.services.BollettiniServices;


@RestController
@RequestMapping("api")
public class ControllerREST {
	
	@Autowired
	private BollettiniServices services;
	
	@GetMapping("index")

	
	@GetMapping("pagamento")

	
	@PostMapping("uscita")

	
	@PostMapping("conferma")
	
	@GetMapping("voci")
	public List<String> getVoci(){
		return service.getVoci();
	}
	
	@GetMapping("voce/{parola}")
	public Glossario getVoce(@PathVariable("parola") String voce) {
		return service.getByVoce(voce);
	}
	
	@GetMapping("api/sectors")
	public List<String> getSettori(){
		return service
				.getStandardPoors()
				.stream()
				.map(stand -> stand.getGICSSector())
				.distinct()
				.sorted()
				.toList();
	}
	
	@GetMapping("api/standard")
	public List<StandardPoors> getStandard(){
		return service.getStandardPoors();
	}
	
	@GetMapping("api/standard/{sector}")
	public List<StandardPoors> getStandard(@PathVariable("sector") String sector){
		return service.getStandardPoorsBySector(sector);
	}
	
	@PostMapping("voce/json")
	public Glossario addVoce(@RequestBody Glossario g) {
		return service.addNuovaVoce(g);
		
	}

	
	
}
