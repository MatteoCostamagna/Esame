package db;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProvaDAOImpl implements ProvaDAO {

	private Connessione miaConn = new Connessione();
	private PreparedStatement ps;
	
	
	@Override
	public void addProva(String prova) {

		
		try {
			ps = miaConn.getConn().prepareStatement(ADD_TESTO);
			
			ps.setString(1, prova);
			
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	@Override
	public void addProva(String... prova) {
		try {
			ps = miaConn.getConn().prepareStatement(ADD_TESTO);
			
			for (String string : prova) {
				ps.setString(1, string);
				ps.execute();
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
