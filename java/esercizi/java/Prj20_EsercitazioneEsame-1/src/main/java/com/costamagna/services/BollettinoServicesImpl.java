package com.costamagna.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costamagna.entities.Bollettino;
import com.costamagna.entities.ContoCorrente;
import com.costamagna.repo.BollettinoDAO;
import com.costamagna.repo.ContoCorrenteDAO;

@Service
public class BollettinoServicesImpl implements BollettinoServices {
	
	@Autowired
	private BollettinoDAO bollettinoDao;
	
	@Autowired
	private ContoCorrenteDAO contoCorrDao;
	
	
	@Override
	public List<Bollettino> getBollettini() {
		return bollettinoDao.findAll();
	}

	@Override
	public Bollettino getBollettinoById(int id) {
		return bollettinoDao.findById(id).get();
	}

	@Override
	public Bollettino getBollettinoByUtente(int idUtente) {
		return bollettinoDao.findById(idUtente).get();
	}

	@Override
	public Bollettino addBollettino(Bollettino b) {
		return bollettinoDao.save(b);
	}

	@Override
	public List<ContoCorrente> getContiCorr() {
		return contoCorrDao.findAll();
	}

	@Override
	public ContoCorrente addContiCorr(ContoCorrente c) {
		return contoCorrDao.save(c);
	}

	@Override
	public ContoCorrente getContoByCod(int cod) {
		return contoCorrDao.findById(cod).get();
	}

}
