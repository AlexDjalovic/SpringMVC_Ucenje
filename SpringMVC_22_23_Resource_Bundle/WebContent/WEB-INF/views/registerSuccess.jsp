<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>USPESNO STE SE REGISTROVALI SA SLEDECIM PODACIMA</h2>
<table>
<tr>
<td>Username</td>
<td>${user.name}</td>
</tr>

<tr>
<td>Email</td>
<td>${user.email}</td>
</tr>

<tr>
<td>Zemlja porekla</td>
<td>${user.country}</td>
</tr>
<tr>
<td>Starost:</td>
<td>${user.age}</td>
</tr>

</table>
<a href="/SpringMVC_22_23_Resource_Bundle/">Vrati se na pocetnu stranu za registraciju</a>
</body>
</html>