
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!doctype html>

<html lang="en">
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Mostrar BBDD!</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<style>
.container{
	margin-top:60px;
	max-width:600px;
}
</style>
    <!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
  </head>
  <body>
    <h1 align="center">Tabla de empleados</h1>
	<div class="container">
		
			<table class="table table-dark">
				<tr>
					<td>DNI</td>
					<td>Nombre</td>
					<td>Categoria</td>
					<td>Sexo</td>
					<td>Años</td>
				</tr>
				<c:forEach var="empleado" items="${empleados}">
					<tr>
						<td>${empleado.getDni()}</td>
						<td>${empleado.getNombre()}</td>
						<td>${empleado.getCategoria()}</td>
						<td>${empleado.getSexo()}</td>
						<td>${empleado.getAnyos()}</td>
					</tr>
				</c:forEach>
			</table>
			
	
	</div>
	


  </body>
</html>