<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
  <%@taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>${headerPoruka}</h1>

<a href="/SpringMVC_31_Localisation?Lang=en">English</a>||
	<a href="/SpringMVC_31_Localisation?Lang=fr">Srpski(iako je oznaka za francuski)</a>
<table>
<tr>
<td><spring:message code="label.ime"/> </td>
<td>${student.name}</td>
</tr>
<tr>
<td>Pol studenta: </td>
<td>${student.gender}</td>
</tr>

<tr>
<td>Tehnologije: </td>
<td>${student.technologies}</td>
</tr>

<tr>
<td>Grad studenta: </td>
<td>${student.city}</td>
</tr>

<tr>
<td>Telefon studenta: </td>
<td>${student.phone}</td>
</tr>

<tr>
<td>Datum rodjenja studenta: </td>
<td>${student.dob}</td>
</tr>
</table>
<a href="/SpringMVC_31_Localisation/"><spring:message code="label.return"/></a>

</body>
</html>