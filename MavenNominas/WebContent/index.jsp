<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>INDEX JSP</title>
</head>
<body>
<h2>Estas son las opciones entre las que puedes elegir:</h2>

	<form name="mostrar" action="ServletEmpleado?action=mostrar" method="post">	
		<input class="boton" type="submit" value="MostrarEmpleados" name="mostrar">
	</form>
	
	<form name="salario" action="ServletEmpleado?action=salario" method="post">	
		<input type="text" name="dni"  placeholder="escribe dni...">
		<input class="boton" type="submit" value="MostrarSalario" name="salario">
	</form>
	
	
	
	
	
	<!-- <form name="mostrar" action="ServletUno?action=Opcion3" method="post">	
		<input class="boton" type="submit" value="ModificarEmpleados" name="modificar">
	</form>-->
	

</body>
</html>
