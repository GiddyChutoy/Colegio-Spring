<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@ page isELIgnored="false"%>
<html>
<head>
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/formularios.css">
<link rel="stylesheet" href="css/tablas.css">
</head>
<body>
	<header>
		<h2>Inserción de nuevo alumno</h2>
	</header>
	<%@include file="/menu.html"%>

	<div class="container">
		<div class="form">

			<form action="http://localhost:8080/Colegio/insertarAlumnos"
				method="post">

				<label for="id">DNI Alumno</label> <input type="text" id="id"name="id"> 
				<label for="nombre">Nombre Alumno</label> 
				<input type="text" id="nombre" name="nombre"><br> 
				<select name="municipios" id="municipios" form="formulario">

					<c:forEach items="${comboMunicipios }" var="municipios">
						<option value="${municipios.id }">${municipios.descripcion}</option>
					</c:forEach>

				</select>
				<label for="familiaNumerosa">Familia numerosa:</label>
				<input type="checkbox" id="familiaNumerosa" name="familiaNumerosa" value="SI">
				<br>
				<input type="submit" value="Enviar">

			</form>

		<c:if test="${resultado == 1 }">
			<p>Alumno insertado con éxito</p>
		</c:if>
		</div>
	</div>



</body>
</html>