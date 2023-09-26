<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<p>TEXTO DESDE LA PAGINA JSP</p>

	<form action="MyServlet" method="GET">
		<button type="submit">Mensaje GET</button>
	</form>

	<br>

	<form action="MyServlet" method="POST">
		<button type="submit">Mensaje POST</button>
	</form>


</body>
</html>