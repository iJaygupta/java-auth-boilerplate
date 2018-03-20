<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Student Login</h1> 
<form action="LoginServlet" method="post" required>
<h5>Sign in if you already have an account<h5>    
Enter Username :<input type="text" name="uname"><br>
Enter Password :<input type="password" name="pass"><br>
<input type="submit" value="Login">
<input type="reset" value="Reset"><br>
<h4>to create an account click on sign up</h4>
<a href="Signup.jsp"> <input type="button" value="Signup"></a>
</form>
</body>
</html>
