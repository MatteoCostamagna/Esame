package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.PokemonPict;
import com.maboglia.repos.PokemonPictDAO;

@Service
public class PokemonServiceImpl implements PokemonService {

	@Autowired
	private PokemonPictDAO pictDAO;
	
	@Override
	public List<PokemonPict> getPokePict() {
		return pictDAO.findAll();
	}

	@Override
	public PokemonPict getPokePict(String name) {
		return pictDAO.getReferenceById(name);
	}

}
