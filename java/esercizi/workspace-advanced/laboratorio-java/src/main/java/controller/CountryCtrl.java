package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import model.Country;

public class CountryCtrl {

	List<Country> lista = new ArrayList<>();
	String FILE_DIR = "src/main/resources/files/";

	public static void main(String[] args) {
		CountryCtrl ctrl = new CountryCtrl();
		ctrl.leggiFile(new File(ctrl.FILE_DIR + "countries.json"));
		List<String> list = ctrl
			.lista
			.stream()
			.map(c -> c.getRegion().concat(","+c.getName()).concat(","+c.getCapital()))
			.toList();
		ctrl.scriviFile(new File(ctrl.FILE_DIR + "countries.csv"), list);
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

			ArrayList<Country> fromJson = gson.fromJson(sb.toString(), new TypeToken<List<Country>>() {
			}.getType());

			for (Country country : fromJson) {
				// System.out.println(country.getTitolo());
				lista.add(country);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void scriviFile(File f, Collection<String> collezione) {

		try {
			PrintWriter output = new PrintWriter(f);
			collezione.forEach(temp -> output.println(temp));
			output.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
