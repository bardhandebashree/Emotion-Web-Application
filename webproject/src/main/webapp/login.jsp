<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 

 
<!DOCTYPE html>
<html>
<head>
      <meta charset="utf-8">
      <title>Login</title>


  </head>

  <body>
  <form action="/login"method="GET">
  <h2>LOGIN</h2><br>
	<h3>User Name:</h3>
<input type="text" name="username" id="username"><br>
  <h3>Email:</h3>
<input type="text" name="email"><br>
<h3>Password:</h3>
<input type="password" name="password"><br>
<input type="submit" onclick="sendData()"><br>
</form>
<script>
function sendData(){
  var login_user = document.getElementById("username").value;
  localStorage.setItem("username",login_user);
   //location.href = "emotion.jsp";
   // Opening new window works too
  // window.open("emotion.jsp");
}

</script>

</html>