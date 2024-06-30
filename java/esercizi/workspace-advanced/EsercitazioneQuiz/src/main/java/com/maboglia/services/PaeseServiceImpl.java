package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Paese;
import com.maboglia.repos.PaeseDAO;

@Service
public class PaeseServiceImpl implements PaeseService {

	@Autowired
	private PaeseDAO dao;
	
	@Override
	public List<Paese> getPaesi() {
		return dao.findAll();
	}

	@Override
	public Paese getPaeseByCapital(String capital) {
		return null;
	}

	@Override
	public Paese getPaeseByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Paese> getPaesiByRegion(String region) {
		// TODO Auto-generated method stub
		return dao.findByRegion(region);
	}

}
