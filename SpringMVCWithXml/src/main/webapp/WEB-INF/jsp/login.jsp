<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
</head>
<body>
<%-- <h1>${msg}</h1> --%>
<h1> <spring:message  code="app.title"/></h1>
 <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>
 <br>
 <br>
 	
 
<%-- <form action=submitEmployeeInfo method="post">
Employee Id<input type="text" name="employeeId"><br>
Employee Name<input type="text" name="employeeName"><br>
Employee salary<input type="text" name="employeeSalary"><br>

Address

State :<input type="text" name="address.state"><br>
City :<input type="text" name="address.city"><br>
Pin Code :<input type="text" name="address.pinCode"><br>
<input type="submit" value="submit Info">
</form> --%>
	
	<form:form action="submitEmployeeInfo" commandLine="emp">
	Employee Id<input type="text" name="employeeId" path="employeeId">
	<form:errors path="employeeId"></form:errors>
	Employee Name<input type="text" name="employeeName" path="employeeName">
	Employee salary<input type="text" name="employeeSalary" path="employeeSalary">	
	<!-- State :<input type="text" name="address.state">
	City :<input type="text" name="address.city">
	Pin Code :<input type="text" name="address.pinCode"> -->
	<input type="submit" value="submit Info">
	</form:form>

</body>
</html>