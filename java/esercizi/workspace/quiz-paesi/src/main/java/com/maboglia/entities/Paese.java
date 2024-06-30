package com.maboglia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "countries")
public class Paese {

	@Column(name = "alpha2Code", columnDefinition = "varchar(2)")
	@Id
	private String alpha2Code;
	
	@Column(name="capital")
	private String capitale;
	
	@Column(name="name")
	private String nome;

	public String getAlpha2Code() {
		return alpha2Code;
	}

	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}

	public String getCapitale() {
		return capitale;
	}

	public void setCapitale(String capitale) {
		this.capitale = capitale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	
	
}
