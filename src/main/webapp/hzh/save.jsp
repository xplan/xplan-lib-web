<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><font color="red">Save User</font></h1>
  	
  		<s:form action="saveUser.action" method="POST">
  		
  		<s:textfield name="user.firstname" label="firstname"></s:textfield>
  		
  		<s:textfield name="user.lastname" label="lastname"></s:textfield>
  		<s:textfield name="user.age" label="age"></s:textfield>
  		<s:submit></s:submit>
  	
  	</s:form> 

</body>
</html>