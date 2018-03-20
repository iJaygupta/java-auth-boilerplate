<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%    
String first_name=request.getParameter("fname");
String last_name=request.getParameter("lname");
String email=request.getParameter("email");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
Statement stmt=conn.createStatement();

int i=stmt.executeUpdate("insert into users(first_name,last_name,e_mail)values('"+first_name+"','"+last_name+"','"+email+"')");
out.println("Data is successfully inserted!");

}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>