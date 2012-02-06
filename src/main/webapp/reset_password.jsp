<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2><font color="red">Reset Password</font></h2>
  	
  	<s:form action="resetPassword.action" method="POST">
  		
  		<s:textfield name="user.firstname" label="old password" ></s:textfield><br>
  		<s:textfield name="user.lastname" label="new password"></s:textfield><br>
  		<s:textfield name="user.age" label="reset password"></s:textfield><br>
  		<s:submit></s:submit>
  	
  	</s:form>

</body>
</html>