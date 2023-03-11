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
<h1>UFC Fighters</h1>

<form action="getFighter.do" method="GET">
		Fighter ID: <input type="text" name="id" /> <input type="submit"
			value="Show Fighter" />
	</form>

<c:choose>
<c:when test="${empty fighters }">No Fighters Found</c:when>

<c:otherwise>



<tbody>
<c:forEach var="fighter" items="${fighters }">

<a href="getFighter.do?id=${fighter.id }">${fighter.name}</a><br>


<%-- <tr><td>${fighter.id} ${fighter.name } <img src="${fighter.imageurl }" width="150" height="150">
${fighter.strikeAvg } ${fighter.background } ${fighter.lastFight } ${fighter.stance }</td></tr>
	 --%>
	
	



</c:forEach>

</c:otherwise>


</c:choose>

<h2>Create a Fighter</h2>

<form action="createFighter.do" method="POST"><br>
	Fighter Name: <input type="text" name="name" /><br>
	Profile Pic(Image URL required): <input type="text" name="imageurl" /><br>
	Home Country: <input type="text" name="homeCountry" /><br>
	Weight Class(lbs.): <input type="text" name="weightClass" /><br>
	Strike Average: <input type="text" name="strikeAvg" /><br>
	Martial Arts Background: <input type="text" name="background" /><br>
	Most Recent Bout: <input type="date" name="lastFight" /><br>
	Stance: <input type="text" name="stance" /><br>
	<input type="submit"
			value="Create Fighter" />
</form>


</body>
</html>