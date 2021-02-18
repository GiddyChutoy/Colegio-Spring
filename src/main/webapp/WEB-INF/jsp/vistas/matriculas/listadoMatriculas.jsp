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
	<h1>Listado matriculas</h1>
	<%@include file="../../menu.html"%>




	<div class="container">
		<div class="form">

			<form action="http://localhost:8080/Colegio/listadoMatriculas" method="post">

				<label for="idAsigntatura">Id asigntatura</label> 
				<input type="text" id="idAsigntatura" name="idAsigntatura">
				
				<label for="asignatura">Nombre asigntatura</label> 
				<input type="text" id="asignatura" name="asignatura">
				
				<br>
				
				<label for="idAlumno">Id Alumno</label> 
				<input type="text" id="idAlumno" name="idAlumno">
				
				
				<label for="nombre">Nombre</label> 
				<input type="text" id="nombre" name="nombre">
				
				<br>
				
				<label for="fecha">Fecha</label> 
				<input type="date" id="fecha" name="fecha">
				
				<label for="activo">Activo</label> 
				<input type="checkbox" id="activo" name="activo">
				
				<br> 
				<input type="submit" value="Enviar">

			</form>

		</div>
		<table>
		
		<tr>
		<th>Nombre asignatura</th>
		<th>Id alumno</th>
		<th>Nombre alumno</th>
		<th>Fecha</th>
		<th>Activo</th>
		</tr>
			<c:forEach items="${lista }" var="alumno">
				<tr>
					<td>${alumno.asignatura}</td>
					<td>${alumno.idAlumno}</td>
					<td>${alumno.nombre }</td>
					<td>${alumno.fecha}</td>
					<td>${alumno.activo}</td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>