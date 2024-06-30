package com.costamagna.services;

import java.util.List;

import com.costamagna.entities.Bollettini;
import com.costamagna.entities.ContiCorrenti;

public interface BollettiniServices {
	
	Bollettini addBollettini (Bollettini b);
	List<Bollettini> getBollettini();
	
	ContiCorrenti addContiCorrenti (ContiCorrenti c);
	List<ContiCorrenti> getContiCorrenti();
}
