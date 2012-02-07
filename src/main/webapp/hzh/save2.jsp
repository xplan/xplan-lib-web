<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>Save User</title>

  </head>
  
  <body>
  	<h1><font color="red">Save User</font></h1>
  	
  	<s:form action="saveUser.action" method="POST">
  		
  		<s:textfield name="user.username" label="username"></s:textfield>
  		<s:textfield name="user.password" label="password"></s:textfield>
  		<s:textfield name="user.repassword" label="repassword"></s:textfield>
  		<s:submit label="注册"></s:submit>
  	
  	</s:form> 
  </body>
</html>