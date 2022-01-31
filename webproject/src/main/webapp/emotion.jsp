<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="getData()">
<script>
function getData(){
  var x = localStorage.getItem("username");
  document.getElementById("demo").innerHTML = x;
  //console.log(x);
  
}
</script>
<h3>Welcome</h3>
<h3 id="demo"></h3>
<form action="/emotion"method="POST">
  
	<h3>PUT Emotion:</h3>ID:<input type="number" name="id"><br>
EMOTION:<input type="text" name="emotions"><br>
<input type="submit"><br>

</form>
</body>
</html>