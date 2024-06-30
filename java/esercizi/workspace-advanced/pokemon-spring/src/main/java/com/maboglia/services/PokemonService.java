package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.PokemonPict;

public interface PokemonService {

	List<PokemonPict> getPokePict();
	PokemonPict getPokePict(String name);
	
}
