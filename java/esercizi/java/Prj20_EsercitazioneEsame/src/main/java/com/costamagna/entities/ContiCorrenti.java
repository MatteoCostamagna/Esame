package com.costamagna.entities;

import jakarta.persistence.Entity;

@Entity
public class ContiCorrenti {
	
	
	private int codContoCorrente;
	
	private String nomeIntestatario;
	
	
	public int getCodContoCorrente() {
		return codContoCorrente;
	}
	public void setCodContoCorrente(int codContoCorrente) {
		this.codContoCorrente = codContoCorrente;
	}
	public String getNomeIntestatario() {
		return nomeIntestatario;
	}
	public void setNomeIntestatario(String nomeIntestatario) {
		this.nomeIntestatario = nomeIntestatario;
	}

	
	
}
