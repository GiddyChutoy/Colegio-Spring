<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/formularios.css">
<link rel="stylesheet" href="css/tablas.css">
</head>
<body>
	<h1>Borrar Matricula</h1>
	<%@include file="../../menu.html"%>




	<div class="container">
		<div class="form">

			<form action="http://localhost:8080/Colegio/borrarMatriculasFormulario" method="post">
				<label for="nombreAlumno">Nombre alumno: </label> 
				<input type="text" id="nombreAlumno" name="nombreAlumno"> 
				<label for="asignatura">Asignatura:</label>
				<input type="text" id="asignatura" name="asignatura">
				<label for="fecha">Fecha: </label>
				<input type="date" id="fecha" name="fecha">
				<br> 
				<input type="submit" value="Enviar">

			</form>

		</div>
		
		<c:forEach items="${listaMatricula}" var="matricula">
			<form action="http://localhost:8080/Colegio/borrarMatriculas" method="POST">
				<input class="hidden" id="idMatricula" name="idMatricula" type="text" value="${matricula.id }" readonly>
				<label for="nombreAlumno">Nombre alumno: </label> 
				<input id="nombreAlumno" name="nombreAlumno" value="${matricula.nombre }" readonly>
				<label for="asignatura">Asignatura: </label>
				<input type="text" id="asignatura" name="asignatura" value="${matricula.asignatura }" readonly>
				<label for="fecha">Fecha: </label>
				<input type="date" id="fecha" name="fecha" value="${matricula.fecha }" readonly>
				<br> 
				<input type="submit" value="Borrar">
			</form>
		</c:forEach>
		
	</div>
</body>
</html>