package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import database.CanzoneDAO;
import database.CanzoneDAOImpl;
import model.Canzone;

public class ProvaScritturaSuDB {

	public static void main(String[] args) {

		CanzoneDAO dao = new CanzoneDAOImpl();
		
		File f = new File("\\\\fs-aule\\2023\\B22-126-2024\\canzoni.txt");
		
		try {
			Scanner input = new Scanner(f);
			while (input.hasNextLine()) {
				String riga = input.nextLine();
				String[] split = riga.split(";");
				dao.addCanzone(new Canzone(split[0], split[1]));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Canzone> canzoni = dao.getCanzoni();
		
		for (Canzone canzone : canzoni) {
			System.out.println(canzone);
		}
		
		
		
		
//		Canzone c = new Canzone("sinceramente","annalisa");
//		Canzone c2 = new Canzone("bum bum","rose villain");
//		
//		dao.addCanzone(c);
//		dao.addCanzone(c2);

	}

}
