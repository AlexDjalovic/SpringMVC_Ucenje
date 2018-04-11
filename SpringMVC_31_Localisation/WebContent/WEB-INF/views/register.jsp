<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${headerPoruka}</h1>
	<form:errors path="student.*"></form:errors>
	
	<a href="/SpringMVC_31_Localisation?Lang=en">English</a>||
	<a href="/SpringMVC_31_Localisation?Lang=fr">Srpski(iako je oznaka za francuski)</a>
	<form:form
		action="/SpringMVC_31_Localisation/registerSuccess"
		method="post" modelAttribute="student">

		<table>
			<tr>
				<td><spring:message code="label.name"/></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
			<!--	<td><form:label path="gender">Izaberi pol</form:label></td>-->
			<td><spring:message code="label.gender"/></td>
				<td><form:radiobuttons path="gender" items="${genderList}" /></td>
			</tr>
<!--PRAVI VELIKI SELECT JER PREPOZNAJE DA SAM U POJO KLASI STAVLJAO DA JE TECHNOLOGIES TIPA ARRAYLIST ZATO NIJE KLASICAN SELECT BUTTON -->
			<tr>
				<!--<td><form:label path="technologies">Izaberi tehnologiju</form:label></td>-->
				<td><spring:message code="label.technologies"/></td>
				<td><form:select path="technologies" multiple="true">
						<form:options items="${techList}" />
					</form:select></td>
			</tr>

			<tr>
			<!--	<td><form:label path="city">Izaberi grad</form:label></td>-->
				<td><spring:message code="label.city"/></td>
				<td><form:select path="city">
						<form:options items="${cities}" />
					</form:select></td>
			</tr>
			<tr>
			<!--	<td><form:label path="phone">Unesi broj telefona</form:label></td>-->
				<td><spring:message code="label.phone"/></td>
				<td><form:input path="phone" /></td>
			</tr>
			<tr>
				<!--<td><form:label path="dob">Unesi datum rodjenja</form:label></td>-->
				<td><spring:message code="label.dob"/></td>
				<td><form:input path="dob" title="mm/dd/yyyy"  />MM/DD/YYYY</td>
			</tr>
			<tr>
				<td><input type="submit" value="registruj se"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>