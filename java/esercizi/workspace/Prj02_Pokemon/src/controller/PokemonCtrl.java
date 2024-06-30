package controller;

import java.util.ArrayList;
import java.util.List;

import database.PokemonDAO;
import database.PokemonDAOImpl;
import model.Pokemon;

public class PokemonCtrl {

	private PokemonDAO dao = new PokemonDAOImpl();
	
	public List<String> getTipiPokemon(){
		return dao.getTipiPokemon();
	}
	
	public List<String> getNomiPokemon(){
		List<String> pokemon = new ArrayList<>();//scatola vuota
		for (   Pokemon p : dao.getAllPokemon()   ) {
			pokemon.add(p.getNome());//riempio scatola
		}//dopo
		return pokemon;//ritorno scatola
	}

}
