package com.maboglia.db;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.Date;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import db.Connessione;
import db.ProvaDAO;
import db.ProvaDAOImpl;

public class TestConnessione {

	@Test
	@Order(1)
	public void provaConnessione() {
		Connessione c = new Connessione();
		
		c.getConn();
		
	}
	
	@Test
	@Order(2)
	public void addTesto() {
		ProvaDAO pd = new ProvaDAOImpl();
		
		pd.addProva("test " + LocalDateTime.now());
	
		pd.addProva("pippo", "pluto", "pisolo", "dotto");
		
		assertTrue(2+2 == 5);
		assertFalse(false);
	}
	
}
