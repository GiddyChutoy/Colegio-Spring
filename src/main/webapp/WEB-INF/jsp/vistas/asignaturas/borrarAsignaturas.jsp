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
	<h1>Borrar asignaturas</h1>
	<%@include file="../../menu.html"%>
			<div class="form">
			
				<form action="http://localhost:8080/Colegio/formularioBorrarAsignaturas" method="post">
	
					<label for="id">Id asignatura</label> 
					<input type="text" id="id" name="id"> 
					<label for="nombre">Nombre asignatura</label> 
					<input type="text" id="nombre" name="nombre">
					<br> 
					
					<input type="submit" value="Enviar">
				</form>
			
			</div>
			
			<c:forEach items="${lista }" var="asignatura">
				<div class="form">
					<form action="http://localhost:8080/Colegio/borrarAsignatura" method="POST">
						<label for="id">Id asignatura:</label>
						<input readonly type="text" value="${asignatura.id }" id="id" name="id">
						<label for="nombre">Nombre asignatura</label>
						<input value="${asignatura.nombre }" id="nombre" name="nombre" readonly>
						
						<br>
						
						<input type="submit" value="borrar">
					</form>
				</div>
			</c:forEach>
</body>
</html>