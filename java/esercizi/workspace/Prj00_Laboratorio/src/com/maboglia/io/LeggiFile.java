package com.maboglia.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class LeggiFile {

	public static void main(String[] args) {
		File f = new File("\\\\fs-aule\\2023\\B22-126-2024\\canzoni.txt");
		try {
			URL indirizzo = new URL("https://raw.githubusercontent.com/maboglia/ProgrammingResources/master/tabelle/film/best-netflix-movies-rt.json");
			InputStream openStream = indirizzo.openStream();
			Scanner input = new Scanner(openStream);
//			
//			while(input.hasNextLine()) {
//				String riga = input.nextLine();
//				System.out.println(riga);
//			}
//			
			
			List<String> ledZepp = Files
				.readAllLines(Paths.get("\\\\fs-aule\\2023\\B22-126-2024\\canzoni.txt"))
				.stream()
				.filter(c -> c.contains("Zeppe"))
				.toList();
				//.forEach(riga -> System.out.println(riga));
			
			PrintWriter pw = new PrintWriter("\\\\fs-aule\\2023\\B22-126-2024\\ledz.txt");
			
			for (int i = 0; i < ledZepp.size(); i++) {
				pw.println(ledZepp.get(i));
			}
			
			for (String string : ledZepp) {
				pw.println(string);
			}
			
			ledZepp.forEach(s -> pw.println(s));
			
			pw.close();
			
		} 	catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
		}
			catch (MalformedURLException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
		} 	catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch(Exception e) {
				
			}

	}

}
