package controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import model.Canzone;

public class CanzoneCtrl {

	private List<Canzone> canzoni;
	
	public CanzoneCtrl() {
		this.canzoni = new ArrayList<>();
	}
	
	public void addCanzone(String titolo, String cantante) {
		canzoni.add(new Canzone(titolo, cantante));
	}
	
	public void addCanzone(Canzone c) {
		canzoni.add(c);
	}
	
	public List<Canzone> getCanzoni() {
		return canzoni;
	}
	
	public List<String> getTitoli(){
		List<String> titoli = new ArrayList<>();
		for (Canzone c : canzoni) {
			titoli.add(c.getTitolo());
		}
		return titoli;
	}
	
	public Set<String> getCantanti(){
		return new HashSet<String>(canzoni
			.stream()
			.map(c -> c.getCantante())
			.toList());
	}
	
}
