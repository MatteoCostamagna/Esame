package database;

import java.util.List;

import model.Canzone;

public interface CanzoneDAO {

	//proprieta sono implicitamente public final
	String FIND_ALL = "SELECT * FROM canzoni";
	String ADD = "INSERT INTO canzoni (titolo, cantante) values (?,?)";
	
	//metodi implicitamente public e abstract
	void addCanzone(Canzone c);
	List<Canzone> getCanzoni();
	
	
}
