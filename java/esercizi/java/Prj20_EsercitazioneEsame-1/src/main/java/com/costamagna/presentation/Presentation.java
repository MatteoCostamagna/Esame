package com.costamagna.presentation;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.costamagna.entities.Bollettino;
import com.costamagna.entities.ContoCorrente;
import com.costamagna.integration.ControllerREST;
import com.costamagna.services.BollettinoServices;

@Controller
@RequestMapping("/")
public class Presentation {
	
	private ControllerREST rest;
	private BollettinoServices services;
	

	@PostMapping("/datiBollettinoInseriti")
	public String inserimentoDati(@ModelAttribute Bollettino b) {
		List<ContoCorrente> conti = services.getContiCorr();
		for (ContoCorrente conto : conti) {
			if(b.getNumContoCorrDest()==conto.getCodContoCorrente()) {
				rest.addBollettino(b);	
				return "conferma";
			}
						
		}
		return "errorConto";
	}
	
	@PostMapping("/confermaDatiPagamento")
	public String confermaPagamento(@ModelAttribute Bollettino b) {
		List<Bollettino> bollettini = services.getBollettini();		
		int idUltimoBollettino= bollettini.size();
		Bollettino oldBollettino = services.getBollettinoById(idUltimoBollettino);
		oldBollettino.setNome(b.getNome());
		oldBollettino.setNumCartaCredito(b.getNumCartaCredito());
		rest.addBollettino(oldBollettino);
		return "uscita";
	}
}
