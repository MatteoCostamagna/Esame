package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Canzone;

public class CanzoneDAOImpl implements CanzoneDAO {

	private Connessione miaConn;//connessione al db
	private PreparedStatement ps;//contenitore per istruzioni
	private ResultSet rs;//contenitore per risultati
	
	public CanzoneDAOImpl() {
		miaConn = new Connessione();
	}
	
	@Override
	public void addCanzone(Canzone c) {
		try {
			ps = miaConn.getConn().prepareStatement(ADD);//preparo la q
			ps.setString(1, c.getTitolo());//binding 1 paramtero
			ps.setString(2, c.getCantante());//binding 2 param
			ps.execute();//esecuzione istruzione
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Canzone> getCanzoni() {
		List<Canzone> canzoni = new ArrayList<>();

		try {
			ps = miaConn.getConn().prepareStatement(FIND_ALL);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				String titolo = rs.getString("titolo");
				String cantante = rs.getString("cantante");
				Canzone c = new Canzone(titolo, cantante);
				canzoni.add(c);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return canzoni;
	}

}
