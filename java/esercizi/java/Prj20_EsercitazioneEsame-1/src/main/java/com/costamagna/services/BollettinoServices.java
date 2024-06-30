package com.costamagna.services;

import java.util.List;

import com.costamagna.entities.Bollettino;
import com.costamagna.entities.ContoCorrente;

public interface BollettinoServices {
	
	List<Bollettino> getBollettini();
	Bollettino getBollettinoById(int id);
	Bollettino getBollettinoByUtente(int idUtente);
	Bollettino addBollettino(Bollettino b);
	
	List<ContoCorrente> getContiCorr();
	ContoCorrente addContiCorr(ContoCorrente c);
	ContoCorrente getContoByCod(int cod);
}
