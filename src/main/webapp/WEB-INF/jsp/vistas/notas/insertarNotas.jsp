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
	<h1>Insertar nueva nota</h1>
	<%@include file="/menu.html"%>




	<div class="container">
		<div class="form">

			<form action="http://localhost:8080/Colegio/insertarNotas" method="post">
				<label>Alumno:</label>
				<select name="alumnos" id="alumnos">
					<c:forEach items="${listaAlumnos}" var="alumno">
						<option value="${alumno.id}">${alumno.id } - ${alumno.descripcion }</option>
					</c:forEach>
				</select>
				<label>Asignatura:</label>
				<select name="asignaturas" id="asignaturas">
					<c:forEach items="${listaAsignaturas}" var="asignatura">
						<option value="${asignatura.id }">${asignatura.id } - ${asignatura.descripcion }</option>
					</c:forEach>
				</select>
				<br>
				<label for="nota">Nota: </label>
				<input type="text" id="nota" name="nota">
				<label for="fecha">Fecha</label>
				<input type="text" id="fecha" name="fecha">
				<br> 
				<input type="submit" value="Enviar">

			</form>

		</div>
	</div>

</body>
</html>