package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Paese;
import com.maboglia.repos.PaeseDAO;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private PaeseDAO dao;
	
	@Override
	public List<Paese> getPaesiRandom(int num) {
		return dao.findPaesiRandom(num);
	}

}
