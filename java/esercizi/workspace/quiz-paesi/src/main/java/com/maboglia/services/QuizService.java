package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Paese;

public interface QuizService {

	List<Paese> getPaesiRandom(int num);
	
}
