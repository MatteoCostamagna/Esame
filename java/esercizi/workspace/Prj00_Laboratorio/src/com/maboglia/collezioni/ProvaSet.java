package com.maboglia.collezioni;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.maboglia.model.Libro;

public class ProvaSet {

	public static void main(String[] args) {
//		Set<String> nomi = new HashSet<>();
		Set<String> nomi = new TreeSet<>();

		nomi.add("mattias");
		nomi.add("marco");
		nomi.add("denis");
		nomi.add("marco");
		nomi.add("Raffaele");
		nomi.add("Raffaele");
		nomi.add("Raffaele");
		nomi.add("Raffaele");
		nomi.add("simone");
		
//		for (String nome : nomi) {
//			System.out.println(nome);
//		}
//		
		Libro l1 = new Libro("zanna bianca", 100, 10);
		Libro l2 = new Libro("manitu", 120, 12);
		Libro l3 = new Libro("albachiara", 140, 8);
		
		Set<Libro> libreria = new TreeSet<>();
		
		libreria.add(l1);
		libreria.add(l2);
		libreria.add(l3);
		libreria.add(l2);
		
		for (Libro libro : libreria) {
			System.out.println(libro);
		}
		
		
		
	}

}
