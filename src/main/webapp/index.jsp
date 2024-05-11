<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index JSP</title>
</head>
<body>
	
	<h1> Hola Mundo ${sessionScope.username} </h1>
	
	<h1> Hola a ${param.nombreFormulario}</h1>
	
	
	
</body>
</html>