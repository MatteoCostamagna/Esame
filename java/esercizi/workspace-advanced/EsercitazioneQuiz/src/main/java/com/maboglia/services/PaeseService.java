package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Paese;

public interface PaeseService {

	List<Paese> getPaesi();
	Paese getPaeseByCapital(String capital);
	Paese getPaeseByName(String name);
	
	List<Paese> getPaesiByRegion(String region);
	

}
