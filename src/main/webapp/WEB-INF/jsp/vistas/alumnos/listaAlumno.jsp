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
	<h1>Listado alumnos</h1>
	<%@include file="../../menu.html"%>




	<div class="container">
		<div class="form">

			<form action="http://localhost:8080/Colegio/listadoAlumnos" method="post">

				<label for="id">Id Alumno</label> 
				<input type="text" id="id" name="id"> 
				
				
				<label for="nombre">Nombre Alumno</label> 
				<input type="text" id="nombre" name="nombre">
				
				<br>
				
				<input type="submit" value="Enviar">

			</form>

		</div>
		<table>
		
		<tr>
		<th>ID</th>
		<th>Nombre</th>
		<th>Provincia</th>
		</tr>
			<c:forEach items="${lista }" var="alumno">
				<tr>
					<td>${alumno.id}</td>
					<td>${alumno.nombre}</td>
					<td>${alumno.municipio}</td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>