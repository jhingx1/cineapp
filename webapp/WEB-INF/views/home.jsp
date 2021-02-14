<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<title>Bienvenido a CineApp</title>
</head>
<body>

<!-- 	<ol> -->
<%-- 		<c:forEach items="${peliculas}" var="pelicula"> --%>
<%-- 			<li><c:out value="${pelicula}"></c:out></li>			 --%>
<%-- 		</c:forEach> --%>
<!-- 	</ol> -->
	
	<div class="container">
		<div class="row">
			<h1>Lista de Peliculas</h1>
			<div class="panel panel-default">
				<div class="panel-heading">Tabla de Peliculas</div>
				<div class="panel-body">

					<table class="table table-hover table-striped">
						<thead>
							<tr>
								<td>ID</td>
								<td>Titulo</td>
								<td>Duracion</td>
								<td>Clasifion</td>
								<td>Genero</td>
								<td>Fecha Estreno</td>
								<td>Estatus</td>
							</tr>
						</thead>
						<tbody>

							<c:forEach items="${peliculas}" var="pelicula">
								<tr>
									<td>${pelicula.id}</td>
									<td>${pelicula.titulo}</td>
									<td>${pelicula.duracion}</td>
									<td>${pelicula.clasificacion}</td>
									<td>${pelicula.genero}</td>
									<td>${pelicula.fechaEstreno}</td>
									<td>${pelicula.estatus}</td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>