package com.maboglia.collezioni;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class ProvaMap {

	public static void main(String[] args) {
		TreeMap<String, String[]> regioni = new TreeMap<>();
		
		regioni.put("Piemonte", new String[]{"torino","asti"});
		regioni.put("Lombardia", new String[]{"milano","como"});
		regioni.put("Campania", new String[]{"napoli","salerno"});
		regioni.put("Campania", new String[]{"napoli","salerno"});

		
		
		Set<String> keySet = regioni.keySet();
		Collection<String[]> values = regioni.values();
		
		for (String nomeRegione : keySet) {
			System.out.println(nomeRegione);
			for (String citta : regioni.get(nomeRegione)) {
			System.out.println("\t"+citta);
			
		}
		}
		
	}

}
