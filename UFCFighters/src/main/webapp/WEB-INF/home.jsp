<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>UFC Fighters</title>
</head>
<body>
<h1>Favorite UFC Fighters</h1>
<c:choose>
<c:when test="${empty fighters }">No Fighters Found</c:when>

<c:otherwise>

<c:forEach var="fighter" items="${fighters }">
<li>${fighter.id} ${fighter.name }</li>
</c:forEach>
</c:otherwise>


</c:choose>


</body>
</html>