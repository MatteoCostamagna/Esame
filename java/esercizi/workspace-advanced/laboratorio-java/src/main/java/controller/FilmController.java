package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import model.Film;

public class FilmController {

	List<Film> listaFilm = new ArrayList<>();
	Queue<Film> codaFilm = new LinkedList<>();
	Set<Film> setFilm = new HashSet<Film>();
	Set<Film> setFilmOrdinati = new TreeSet<Film>();
	String FILE_DIR = "src/main/resources/files/";
	
	
	public static void main(String[] args) {
		
		FilmController fc = new FilmController();
		fc.cosaMidai(fc.listaFilm);
		ArrayList<Film> al = new ArrayList<>(); 
		fc.cosaMidai(al);
		fc.cosaMidai(fc.codaFilm);
		fc.leggiFile(new File(fc.FILE_DIR + "best-movies-2023-rt.json"));
		
		fc.calcolaEta(LocalDateTime.of(1992, 7, 27, 5, 0));
		
		System.out.println("-------------------Set--------------------");
		
//		List<String> registi = new ArrayList<String>();
//		
//		for (Film f : fc.listaFilm) {
//			registi.add( f.getRegista());
//		}
		
		List<String> registi = fc
								.listaFilm
								.stream()
								.map(f -> f.getRegista().toUpperCase())
								.sorted()
								.toList();
		
		fc.scriviFile(new File(fc.FILE_DIR + "registi.txt"  ), registi);
		
		//fc.setFilmOrdinati.forEach(f -> System.out.println(f.getTitolo()));
		
		
		
		
	}
	
	public void cosaMidai(Collection<Film> films) {
		System.out.println("mi hai dato " + films.getClass());
	}
	
	public void scriviFile(File f, Collection<String> films) {
		
		try {
			PrintWriter output = new PrintWriter(f) ;
			films.forEach(temp -> output.println(temp));
			output.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void leggiFile(File f) {
		
		try {
			Scanner input = new Scanner(f);
			Gson gson = new Gson();
			StringBuilder sb = new StringBuilder(); 
			
			while (input.hasNextLine()) {
				String string = (String) input.nextLine();
				sb.append(string);
			}
			
			ArrayList<Film> fromJson = gson
					.fromJson(
							sb.toString(), 
							new TypeToken<List<Film>>(){}.getType()
							);
			
			for (Film film : fromJson) {
				//System.out.println(film.getTitolo());
				listaFilm.add(film);
				codaFilm.add(film);
				setFilm.add(film);
				setFilmOrdinati.add(film);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void calcolaEta(LocalDateTime dataStart) {
		
		LocalDateTime dataOggi = LocalDateTime.now();
		System.out.println("Oggi è il " + dataOggi); 
		System.out.println("La data selezionata è " + dataStart); 
		long hoursBetween = ChronoUnit.HOURS.between(dataStart, dataOggi);
		long daysBetween = ChronoUnit.DAYS.between(dataStart, dataOggi);
		System.out.println("differenza ore " + hoursBetween);
		System.out.println("differenza giorni " + daysBetween);
		long oreDormite = daysBetween * 8;
		System.out.println("ore di riposo " + oreDormite);
		System.out.println("ore di attività " + (hoursBetween - oreDormite));
		
		
	}
}
