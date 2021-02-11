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
	<h1>Actualizar alumnos</h1>
	<%@include file="../../menu.html"%>




	<div class="container">
		
		<div class="form">
		
			<form action="http://localhost:8080/Colegio/actualizar" method="post">

				<label for="id">Id Alumno</label> 
				<input type="text" id="id" name="id"> 
				<label for="nombre">Nombre Alumno</label> 
				<input type="text" id="nombre" name="nombre">
				<br> 
				
				<c:forEach items="${comboMunicipio}" var="municipio">
					<select>
						<option value="${municipio.idMunicipio }">${municipio.descripcion}</option>
					</select>
				</c:forEach>
				
				<input type="submit" value="Enviar">
			</form>
		
		</div>
		<c:forEach items="${lista}" var="alumno">
			<div class="form">
			
				<form method="POST" action="http://localhost:8080/Colegio/actualizarAlumnoBD" id="formulario">
					<input class="hidden" name="antiguoId" id="antiguoId" type="text" value="${alumno.id }">
					<label for="id">Id alumno: </label>
					<input type="text" id="id" name="id" value="${alumno.id }">
					<br>
					<label for="nombre">Nombre alumno: </label>
					<input type="text" id="nombre" name="nombre" value="${alumno.nombre }">
					<br>
					<label for="municipio">Municipio:</label>
					<select name="municipio" form="formulario">
						<c:forEach items="${comboMunicipios }" var="municipio">
							<option value="${municipio.id }">${municipio.descripcion }</option>
						</c:forEach>
					</select>
					<label>Familia numerosa:</label>
					
					<c:if test="${alumno.familiaNumerosa == 1}">
					<input type="checkbox" id="familiaNumerosa" name="familiaNumerosa" value="SI" checked>
					</c:if>
					
					<c:if test="${alumno.familiaNumerosa == 0}">
					<input type="checkbox" id="familiaNumerosa" name="familiaNumerosa" value="SI">
					</c:if>
					
					<input type="submit" value="modificar">
				</form>
			
			</div>
		</c:forEach>
	</div>

</body>
</html>