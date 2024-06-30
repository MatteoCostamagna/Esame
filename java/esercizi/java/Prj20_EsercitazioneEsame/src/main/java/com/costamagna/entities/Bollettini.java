package com.costamagna.entities;

import jakarta.persistence.Entity;

@Entity
public class Bollettini {
	
	
	private String codBollettino;
	
	private int importo;
	private String causale;
	private int contoCorrente;
	private String nomePagatore;
	private int numCartaCredito;
	
	public String getCodBollettino() {
		return codBollettino;
	}
	public void setCodBollettino(String codBollettino) {
		this.codBollettino = codBollettino;
	}
	public int getImporto() {
		return importo;
	}
	public void setImporto(int importo) {
		this.importo = importo;
	}
	public String getCausale() {
		return causale;
	}
	public void setCausale(String causale) {
		this.causale = causale;
	}
	public int getContoCorrente() {
		return contoCorrente;
	}
	public void setContoCorrente(int contoCorrente) {
		this.contoCorrente = contoCorrente;
	}
	public String getNomePagatore() {
		return nomePagatore;
	}
	public void setNomePagatore(String nomePagatore) {
		this.nomePagatore = nomePagatore;
	}
	public int getNumCartaCredito() {
		return numCartaCredito;
	}
	public void setNumCartaCredito(int numCartaCredito) {
		this.numCartaCredito = numCartaCredito;
	}
}
