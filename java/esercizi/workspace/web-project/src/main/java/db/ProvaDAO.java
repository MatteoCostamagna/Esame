package db;

public interface ProvaDAO {

	String NOME_TAB = "prova";
//	String ADD_TESTO = "INSERT INTO " + NOME_TAB+ " (testo) values (?)";
	String ADD_TESTO = String.format("INSERT INTO %s (testo) values (?)",NOME_TAB);
	void addProva(String prova);
	void addProva(String... prova);
	
}
