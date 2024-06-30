package model;

//{ "titolo": "The First Slam Dunk", 
//"anno": "(2022)", 
//"rating": "100%", 
//"regista": "Takehiko Inoue" }

//astrazione: -> Film
public class Film implements Comparable<Film> {

	//incapsulamento
	private String titolo;
	private String anno;
	private String rating;
	private String regista;
	
	//getters e setters
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAnno() {
		return anno;
	}
	public void setAnno(String anno) {
		this.anno = anno;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getRegista() {
		return regista;
	}
	public void setRegista(String regista) {
		this.regista = regista;
	}
	
	@Override
	public int compareTo(Film altroFilm) {
		return this.titolo.compareTo(altroFilm.titolo);
	}
	
	
	
	
}
