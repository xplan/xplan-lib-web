<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    <meta charset="utf-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="<%=basePath%>css/login.css" />
	<link type="text/css" rel="stylesheet" href="<%=basePath%>SyntaxHighlighter/Styles/SyntaxHighlighter.css"></link>
	<script type="text/javascript" src="<%=basePath%>SyntaxHighlighter/Scripts/shCore.js"></script>
	<script type="text/javascript" src="<%=basePath%>SyntaxHighlighter/Scripts/shBrushCSharp.js"></script>
	<script type="text/javascript" src="<%=basePath%>SyntaxHighlighter/Scripts/shBrushJava.js"></script>
	<script type="text/javascript" src="<%=basePath%>SyntaxHighlighter/Scripts/shBrushJScript.js"></script>
	<script type="text/javascript" src="<%=basePath%>SyntaxHighlighter/Scripts/shBrushJava.js"></script>
	<script type="text/javascript">
	window.onload=function(){
		dp.SyntaxHighlighter.ClipboardSwf = '/flash/clipboard.swf';
		dp.SyntaxHighlighter.HighlightAll('code');
	}
	</script>
  </head>
  <body>
  <pre name="code" class="JScript">package com.xplan.apps.aplan.dao.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTxTestCase;
import com.xplan.apps.aplan.dao.XPUserDao;
import com.xplan.apps.aplan.entity.XPUser;

@ContextConfiguration(locations = { "/applicationContext-test.xml"})
public class XPUserDaoTest extends SpringTxTestCase {

	@Autowired
	private XPUserDao entityDao;
	
	
	
	
	@Test
	public void testAll(){
		List<XPUser> list = entityDao.find("FROM XPUser WHERE id=1");
		 assertNotNull(list);
		
	}
	
}
  var person = new object（）{
person.name = "cansays";
person.age = 23;
}
  </pre>
  </body>
</html>
