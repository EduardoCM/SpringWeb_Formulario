<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro</title>
</head>
<body>

	<h2>Registro de alumnos</h2>


	<sf:form action="guardarAlumno" method="post" commandName="alumno">
		<table>
			<tr>
				<td>Nombre</td>
				<td><sf:input path="nombre" /></td>
			</tr>
			<tr>
				<td>Apellido</td>
				<td><sf:input path="apellido" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Guardar"></td>
			</tr>
		</table>
	</sf:form>
	
	<a href="listarAlumnos">Mostrar Alumnos</a>

	<!-- 
	<form>
		<table>
			<tr>
				<td>Nombre:</td>
				<td><input type="text"></td>
			</tr>

			<tr>
				<td>Apellido:</td>
				<td><input type="text"></td>
				</td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Guardar Alumno"></td>
			</tr>
		</table>
	</form>
 -->
</body>
</html>