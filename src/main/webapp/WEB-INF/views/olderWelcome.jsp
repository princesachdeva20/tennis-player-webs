
<%@page import="java.time.LocalDate"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOC TYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tennis Player DB</title>
</head>
<body>
<! -- The code below in line number 14 to 19 is called Scriptlet -->
<%
System.out.println("Hello from JSP");
LocalDate currentDate = LocalDate.now();
%>
<p><i>Current Date: <%= currentDate %> </i></p>
<p><i>Today is <%= currentDate.getDayOfWeek() %> </i></p>
<center>
<h2 style="border:black; border-width: 5px; border-style:dashed;">Welcome to the tennis players database Created By Prince!</h2>
</center>
<h3>Player First name: <i>${firstname}</i> </h3>
<h3>Player Last name: <i>${lastname}</i> </h3>
<h3> Player Full name : <i>${fullname}</i> </h3>
</body>
</html>
