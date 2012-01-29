<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    <meta charset="utf-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="<%=basePath%>css/login.css" />
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body id="register">
    <div class="page">
		<div style="margin:50px auto 0 auto;overflow:hidden;" class="r5px" id="page_form">
			<div style="float:right;font-size: 14px;margin: 16px 0 0;"></div>
			<a class="fl" id="page_logo" href="/">
<%--				<img alsignint="" src="http://static.zhihu.com/static/img/logo_black_trans.png">--%>
			</a>
			<h2>我要注册</h2>
			<div class="page_form_wrap c" style="overflow:hidden;">

				<form action="" method="post">
					
					<p>
						<label for="email">邮箱</label>
						<input type="email" value="" placeholder="请使用常用邮箱，注册后不能修改" name="email"  class="s r3px placeholder">
					</p>
					<p>
						<label for="pwd">密码</label>
						<input type="password" value="" placeholder="" name="password" id="pwd" class="s r3px placeholder">
					</p>
					<p>
						<label for="cpwd">密码确认</label>
						<input type="password" value="" placeholder="" name="comfpassword" id="cpwd" class="s r3px placeholder">
					</p>
					<p>
						<label for="fullname">真实姓名</label>
						<input type="text" value="" placeholder="请填写真实姓名，以便成功注册" name="fullname" id="fullname" class="s r3px placeholder">
					</p>
					<p>
						<label for="intro">自我介绍</label>
						<textarea placeholder="你的职业、公司或专业特长" name="intro" id="intro" class="s r3px about_me placeholder"></textarea>
					</p>
					<p class="fr">
						<input type="submit" value="我要注册" name="" class="button_blue r3px" tabindex="4">
					</p>
					<div class="c">
					</div>
				</form>
			
			</div>
	</div>
</div>
  </body>
</html>
