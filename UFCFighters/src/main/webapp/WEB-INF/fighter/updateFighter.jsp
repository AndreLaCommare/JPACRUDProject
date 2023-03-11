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
 <form action="update.do" method="POST"><br>
 <input type="hidden" name="id" value="${fighter.id }"> <br>
 
 <label for="name">Fighter Name:</label>
<input type="text" name="name" value="${fighter.name }"> <br>

<label for="homeCountry">Home Country:</label>
<input type="text" name="homeCountry" value="${fighter.homeCountry }"> <br>

 <label for="imageurl">Fighter Picture:</label>
<input type="text" name="imageurl" value="${fighter.imageurl }"> <br>

<label for="weightClass">Weight Class (lbs.):</label>
<input type="number" name="weightClass" value="${fighter.weightClass }"> <br>

<label for="strikeAvg">Strike Average:</label>
<input type="number" name="strikeAvg" value="${fighter.strikeAvg }"> <br>

<label for="background">Martial Arts Background:</label>
<input type="text" name="background" value="${fighter.background }"> <br>

<label for="lastFightAlt">Most Recent Bout:</label>
<input type="date" name="lastFightAlt" value="${fighter.lastFight}"> <br>

<label for="stace">Stance:</label>
<input type="text" name="stance" value="${fighter.stance }"> <br>




	<!-- 
	Profile Pic(Image URL required): <input type="text" name="imageurl" /><br>
	Home Country: <input type="text" name="homeCountry" /><br>
	Weight Class(lbs.): <input type="text" name="weightClass" /><br>
	Strike Average: <input type="text" name="strikeAvg" /><br>
	Martial Arts Background: <input type="text" name="background" /><br>
	Most Recent Bout: <input type="date" name="lastFight" /><br>
	Stance: <input type="text" name="stance" /><br> -->
	<input type="submit"
			value="Update Fighter" />
</form>

</div>


 
  
</body>
</html>