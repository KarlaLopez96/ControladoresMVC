<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
 	<h1>${message}</h1>
	<form:form action="${pageContext.request.contextPath}/formData" method="POST" modelAttribute= "user">
	
		<label>Ingrese un nombre: </label> 
		<form:input type="text" name="name" path="name"/><br>
		<form:errors path= "name" cssStyle="color:#E81505" action=""></form:errors><br>
		
		<label>Ingrese un nombre de usuario: </label>
		<form:input type="text" name="username" path="username"/><br>
		
		
		<label>Ingrese una clave: </label>
		<form:input type="text" name="password" path="pass"/><br>
		<form:errors path= "pass" cssStyle="color:#E81505" action=""></form:errors><br>
		
		<input type="submit" value="Agregar usuario">
		
	</form:form>
</body>
</html>