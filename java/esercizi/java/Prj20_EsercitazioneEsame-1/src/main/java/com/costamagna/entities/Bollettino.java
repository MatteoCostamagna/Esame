package com.costamagna.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bollettino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idBollett;
	
	private String codBollettino;
	private int importo;
	private String causale;
	private int numContoCorrDest;
	private String nome;
	private int numCartaCredito;
	
	
	public int getIdBollett() {
		return idBollett;
	}
	public void setIdBollett(int idBollett) {
		this.idBollett = idBollett;
	}
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
	public int getNumContoCorrDest() {
		return numContoCorrDest;
	}
	public void setNumContoCorrDest(int numContoCorrDest) {
		this.numContoCorrDest = numContoCorrDest;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumCartaCredito() {
		return numCartaCredito;
	}
	public void setNumCartaCredito(int numCartaCredito) {
		this.numCartaCredito = numCartaCredito;
	}
}
