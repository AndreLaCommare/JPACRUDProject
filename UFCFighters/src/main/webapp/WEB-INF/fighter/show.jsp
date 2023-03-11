<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fighter Details</title>
</head>
<body>
	<div>
  <h2>${fighter.name}</h2>
  <p>Fighter ID: ${fighter.id} </p>
  <img src="${fighter.imageurl }" width="150" height="150"><br>
  <p>Weight Class(lbs.): ${fighter.weightClass }</p>
  <p>Significant Strikes Landed Per Minute: ${fighter.strikeAvg }</p>
  <p>Martial Arts Background: ${fighter.background}</p>
  <p>Most Recent Bout: ${fighter.lastFight}</p>
  <p>Fighter Stance: ${fighter.stance}</p>
</div>
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