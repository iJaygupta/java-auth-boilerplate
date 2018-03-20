<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sign up Page</title>
    </head>
    <body>
    <h1>Enter Details</h1></br>
    <form action="Database.jsp" method="get">
    First name :<input type="text" name="fname"><br>
    Last name  :<input type="text" name="lname"><br>
    Email ID   : <input type="email" name="email"><br>
    Gender: Male<input type="radio" name="Male">
           Female<input type="radio" name="Female"><br>
                 <input type="submit" value="Signup">
                 <input type="reset" value="Reset">
    </form>            
        
        
    </body>
</html>
