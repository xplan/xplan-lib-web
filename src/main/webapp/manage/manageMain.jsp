<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>管理系统主界面</title>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>ext/resources/css/ext-all.css"/>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>ext/resources/css/ext-patch.css"/>
	<script type="text/javascript" src="<%=basePath%>ext/ext-base.js"></script>
	<script type="text/javascript" src="<%=basePath%>ext/ext-all.js"></script>
	<script type="text/javascript" src="<%=basePath%>ext/ext-lang-zh_CN.js"></script>
</head>
<body>

</body>
</html>