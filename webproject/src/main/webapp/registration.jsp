<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
      <meta charset="utf-8">
      <title>Create an account</title>


  </head>

  <body>
  <form action="/register"method="POST">
  <h2>Create your account</h2><br>
  <h3>ID:</h3>
<input type="number" name="id"><br>
  <h3>Username:</h3>
<input type="text" name="username"><br>
  <h3>Email:</h3>
<input type="text" name="email"><br>
<h3>Password:</h3>
<input type="password" name="password"><br>
<input type="submit"><br>
</form>

    
           

    
  </body>
</html>