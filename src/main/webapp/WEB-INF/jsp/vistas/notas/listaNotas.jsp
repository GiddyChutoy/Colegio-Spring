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
	<h1>Listado notas</h1>
	<%@include file="../../menu.html"%>




	<div class="container">
		<div class="form">

			<form action="http://localhost:8080/Colegio/listadoNotas" method="post">

				<label for="id">Id:</label> 
				<input type="text" id="id" name="id"> 
				<label for="nombre">Nombre Alumno:</label> 
				<input type="text" id="nombre" name="nombre"><br>
				<label for="asignatura">Asignatura:</label>
				<input type="text" id="asignatura" name="asignatura">
				<label for="nota">Nota:</label>
				<input type="text" id="nota" name="nota"><br>
				<label for="fecha">Fecha: </label>
				<input type="date" id="fecha" name="fecha">
				<input type="submit" value="Enviar">

			</form>

		</div>
		<table>
		
		<tr>
		<th>ID</th>
		<th>Nombre</th>
		<th>Asignatura</th>
		<th>Nota</th>
		<th>Fecha</th>
		</tr>
			<c:forEach items="${lista }" var="alumno">
				<tr>
					<td>${alumno.id}</td>
					<td>${alumno.nombre}</td>
					<td>${alumno.asignatura}</td>
					<td>${alumno.nota}</td>
					<td>${alumno.fecha}</td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>