package com.costamagna.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costamagna.entities.Bollettini;
import com.costamagna.entities.ContiCorrenti;
import com.costamagna.repo.BollettiniDAO;
import com.costamagna.repo.ContiCorrentiDAO;

@Service
public class BollettiniServicesImpl implements BollettiniServices {
	
	@Autowired
	private BollettiniDAO bollettiniDAO;
	@Autowired
	private ContiCorrentiDAO contiCorrentiDAO;
	
	
	@Override
	public Bollettini addBollettini(Bollettini b) {
		
		return bollettiniDAO.save(b);
	}

	@Override
	public List<Bollettini> getBollettini() {
		// TODO Auto-generated method stub
		return bollettiniDAO.findAll();
	}

	@Override
	public ContiCorrenti addContiCorrenti(ContiCorrenti c) {
		
		return contiCorrentiDAO.save(c);
	}

	@Override
	public List<ContiCorrenti> getContiCorrenti() {
		// TODO Auto-generated method stub
		return contiCorrentiDAO.findAll();
	}

}
