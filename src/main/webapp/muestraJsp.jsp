<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c"  uri="jakarta.tags.core" %>
   <%@ taglib prefix="fn" uri="jakarta.tags.functions"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mostrado JSP</title>
</head>
<body>

		<h1>Hola ${apellido}</h1>
		<c:if test="${apellido == 'Jara'}">
			<p> Te estabamos esperando  </p>
		</c:if>
		<c:choose>
			<c:when test="${apellido == 'Jara'}">
				<p> Te estabamos esperando  </p>
			</c:when>
			<c:when test="${apellido == 'Rojas'}">
				<p> Queonda Wei!!!  </p>
			</c:when>
			<c:otherwise>
				<p> mucho gusto </p>
			</c:otherwise>
		</c:choose>
		<c:forEach items="${nombres}" var="nombre">
				<p>${fn:toUpperCase(nombre)}</p>
		</c:forEach>
</body>
</html>