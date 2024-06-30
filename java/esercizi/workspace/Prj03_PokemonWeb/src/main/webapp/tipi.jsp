<!DOCTYPE html>
<%@page import="controller.PokemonCtrl"%>
<html>
<head>
<meta charset="utf-8">
<title>List tipi pokemon</title>
</head>
<body>

	<h1>Lista tipi pokemon</h1>

	<div>
		<a href="index.html">Home page</a>
	</div>

	<ul>
		
		<% PokemonCtrl controller = new PokemonCtrl(); %>
		
		<% for (String nomePokemon : controller.getTipiPokemon()){ %>
		
			<li>
				<a target="_blank" href="https://www.google.com/search?q=pokemon+<%= nomePokemon %>">
					<%= nomePokemon %>
				</a>
			</li>
		
		<% } %>
		
	</ul>

</body>
</html>