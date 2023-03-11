<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fighter Details</title>
</head>
<body>


<c:choose>
    <c:when test="${empty fighter}">
       No Fighter Found.<br>
       <a href="home.do">Return to Menu</a>
    </c:when>
    <c:otherwise>
        <div>
  <h2>${fighter.name}</h2>
  <p>Fighter ID: ${fighter.id} </p>
  <p>Home Country: ${fighter.homeCountry} </p>
  <img src="${fighter.imageurl }" width="150" height="150"><br>
  <p>Weight Class(lbs.): ${fighter.weightClass }</p>
  <p>Significant Strikes Landed Per Minute: ${fighter.strikeAvg }</p>
  <p>Martial Arts Background: ${fighter.background}</p>
  <p>Most Recent Bout: ${fighter.lastFight}</p>
  <p>Fighter Stance: ${fighter.stance}</p>
 <a href="DeleteFighter.do?id=${fighter.id }">Delete Current Fighter</a> <br>
  <a href="UpdateFighter.do?id=${fighter.id }">Update Current Fighter</a> <br>
  <a href="home.do">Return to Menu</a>
</div>
    </c:otherwise>
</c:choose>


<%-- <c:choose>
<c:when  test="${empty fighter} ">
No Fighters Found<br> <a href="home.do">Return to Menu</a>
</c:when>

<c:otherwise>
	<div>
  <h2>${fighter.name}</h2>
  <p>Fighter ID: ${fighter.id} </p>
  <img src="${fighter.imageurl }" width="150" height="150"><br>
  <p>Weight Class(lbs.): ${fighter.weightClass }</p>
  <p>Significant Strikes Landed Per Minute: ${fighter.strikeAvg }</p>
  <p>Martial Arts Background: ${fighter.background}</p>
  <p>Most Recent Bout: ${fighter.lastFight}</p>
  <p>Fighter Stance: ${fighter.stance}</p>
 <a href="DeleteFighter.do?id=${fighter.id }">Delete Current Fighter</a> <br>
  <a href="UpdateFighter.do?id=${fighter.id }">Update Current Fighter</a> <br>
  <a href="home.do">Return to Menu</a>
</div>
</c:otherwise>


</c:choose> --%>
</body>
</html>

<%-- <tr><td>${fighter.id} ${fighter.name } <img src="${fighter.imageurl }" width="150" height="150">
${fighter.strikeAvg } ${fighter.background } ${fighter.lastFight } ${fighter.stance }</td></tr>
	 --%>
	 
	<!--  <table>
	<thead>
	<th>ID</th>
	<th>Name</th>
	<th>Image</th>
	<th>Strike Average</th>
	<th>Background</th>
	<th>Most Recent Bout</th>
	<th>Stance</th>
	
	</thead> -->