<%@page import="br.com.lead.modelo.Filme"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Filmes</title>
</head>
<body>
	<h2>Lista de Filmes</h2>
	<ol>
		<%  ArrayList<Filme> list = new ArrayList<Filme>(); 
			list = (ArrayList<Filme>)request.getAttribute("listaFiltrada");
			for (Filme filme : list){
				%>
				<li>
				<% out.println( "Nome " + filme.getNome()); %>
				<% out.println(" Genero " + filme.getGenero());%>
				<% out.println("Ano " + filme.getAno()); %>
				</li>
				<%
			}
		%>
	</ol>
</body>
</html>
