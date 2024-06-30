package controller;

import java.io.IOException;

import org.json.JSONArray;

import com.mysql.cj.xdevapi.JsonArray;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api")
public class ControllerRest extends HttpServlet{

	
	public ControllerRest() {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PokemonCtrl ctrl = new PokemonCtrl();
		
		JSONArray lista = new JSONArray(ctrl.getNomiPokemon());
		
		resp.getWriter().print(lista.toString());
	}
	
}
