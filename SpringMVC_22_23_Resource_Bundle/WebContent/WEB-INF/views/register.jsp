<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.greska{
color: red;
}
</style>
</head>
<body>
<h1>${welcome}</h1>
	<%-- 	
		
		
	--%>

	<form:form action="/SpringMVC_22_23_Resource_Bundle/registerSuccess"
		method="post" modelAttribute="user">
	<table>
			<tr>
				<td>Username</td>
				<td><form:input path="name"/></td>
				<td><form:errors path="name" cssClass="greska"/></td>
			</tr>
	<tr>
				<td>Email: </td>
				<td><form:input path="email"/></td>
				<td><form:errors path="email" cssClass="greska"/></td>
			</tr>

			<tr>
				<td>Starost u godinama:</td>
				<td><form:input path="age"/></td>
				<td><form:errors path="age" cssClass="greska"/></td>
			</tr>
	
	<tr>
				<td>Zemlja porekla:</td>
				<td>
				<form:select path="country">
						<form:option value="India">India</form:option>
						<form:option value="USA">USA</form:option>
						<form:option value="CHINA">CHINA</form:option>
				</form:select>
				</td>
				<td><form:errors path="country" cssClass="greska"/></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="registruj se"></td>
			</tr>
			</table>
	</form:form>
</body>
</html>