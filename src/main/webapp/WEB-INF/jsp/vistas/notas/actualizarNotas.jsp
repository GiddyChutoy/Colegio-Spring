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
	<h1>Actualizar notas</h1>
	<%@include file="../../menu.html"%>




	<div class="container">
		<div class="form">

			<form action="http://localhost:8080/Colegio/actualizarNotas" method="post">
				<label for="nombreAlumno">Nombre alumno: </label> 
				<input type="text" id="nombreAlumno" name="nombreAlumno"> 
				
				<label for="asignatura">Asignatura:</label>
				<input type="text" id="asignatura" name="asignatura">
				
				<br>
				
				<label for="fecha">Fecha: </label>
				<input type="date" id="fecha" name="fecha">
				<br> 
				<input type="submit" value="Enviar">

			</form>

		</div>
		
		<c:forEach items="${listaNotas}" var="notas">
			<form action="http://localhost:8080/Colegio/actualizarNotasDB" method="POST">
				<input class="hidden" id="idAntiguo" name="idAntiguo" type="text" value="${notas.id }">
				<label for="nombreAlumno">Nombre alumno: </label> 
				<select name="idAlumno" id="idAlumno">
					<c:forEach items="${listaAlumnos}" var="alumno">
						<option value="${alumno.id }">${alumno.id } - ${alumno.descripcion }</option>
					</c:forEach>
				</select> 
				<select name="idAsignatura" id="idAsignatura">
					<c:forEach items="${listaAsignaturas}" var="asignatura">
						<option value="${asignatura.id }">${asignatura.id } - ${asignatura.descripcion }</option>
					</c:forEach>
				</select> 
				<label for="fecha">Nota: </label>
				<input type="text" id="nota" name="nota" value="${notas.nota }">
				<label for="fecha">Fecha: </label>
				<input type="text" id="fecha" name="fecha" value="${notas.fecha }">
				<br> 
				<input type="submit" value="Modificar">
			</form>
		</c:forEach>
		
	</div>

</body>
</html>