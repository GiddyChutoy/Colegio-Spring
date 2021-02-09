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
	<h1>Insertar nueva asaignatura</h1>
	<%@include file="/menu.html"%>




	<div class="container">
		<div class="form">

			<form action="http://localhost:8080/Colegio/insertarAsignaturas" method="post">

				<label for="id">Id Asignatura</label> 
				<input type="text" id="id" name="id"> 
				<label for="nombre">Nombre Asignatura</label>
				<input type="text" id="nombre" name="nombre">
				<br>
				<label for="curso">Curso</label>
				<input type="text" id="curso" name="curso">
				<label for="tasa">Tasa</label>
				<input type="text" id="tasa" name="tasa">
				<br> 
				<input type="submit" value="Enviar">

			</form>

		</div>
	</div>

</body>
</html>