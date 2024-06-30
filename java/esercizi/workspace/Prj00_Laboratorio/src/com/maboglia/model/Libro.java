package com.maboglia.model;

//pojo
public class Libro implements Comparable<Libro> {
	
	private String titolo;
	private int numPagine;
	private double prezzo;
	
	public Libro() {}
	
	public Libro(String titolo, int numPagine, double prezzo) {
		this.titolo = titolo;
		this.numPagine = numPagine;
		this.prezzo = prezzo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getNumPagine() {
		return numPagine;
	}

	public void setNumPagine(int numPagine) {
		this.numPagine = numPagine;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", numPagine=" + numPagine + ", prezzo=" + prezzo + "]";
	}

	@Override
	public int compareTo(Libro altroLibro) {
		// TODO Auto-generated method stub
//		return this.titolo.compareTo(altroLibro.titolo);
//		return this.numPagine - altroLibro.numPagine;
		return Double.compare(this.prezzo, altroLibro.prezzo); 
	}
	
	
	
	
	
}
