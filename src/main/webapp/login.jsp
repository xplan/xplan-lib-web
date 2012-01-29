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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	
	function checkLogin(){
		var name=document.getElementById('username').value;
		var password=document.getElementById('password').value;
		if(name==''){
			window.alert('请输入用户名!');
			document.getElementById('username').focus();
			return false;
		}
		if(password==''){
			window.alert('请输入密码!');
			document.getElementById('password').focus();
			return false;
		}
		return true;
	}
	//登录按钮提交
	function doLogin(){
		if(checkLogin()){
			document.getElementById('loginform').submit();
		}
	}
	//回车提交
	function doSubmit(event){
		try{
			if(window.event.keyCode==13){//ie
				if(checkLogin()){
					document.getElementById('loginform').submit();
				}
			}
		}catch(err){//ff
			if(event.keyCode==13){
				if(checkLogin()){
					document.getElementById('loginform').submit();
				}
			}
		}
	}
	</script>
  </head>
  
  <body id="login">
  	<div id="page">
  		<h1></h1>
  		<div id="login_form">
  			<form action="<%=basePath%>login/xplogin.do" method="post" id="loginform"style="overflow:hidden;">
  			<ul class="clearfix">
				<li>
					<label for="username">邮箱</label>
					<input type="text"  placeholder="ldneedu@gmail.com" onkeydown="doSubmit(event);" spellcheck="false" name="loginUser.userName" class="text r5px" id="username"/>
				</li>
				<li>
					<label for="password">密码</label>
					<input type="password" name="loginUser.password" onkeydown="doSubmit(event);"class="text r5px"  id="password" />
				</li>
				<li class="last">
					<label for="">&nbsp;</label>
					<input type="button" value="登 录" class="r5px button_blue" id="button_login" onclick="doLogin();">
				</li>
				<li>
					<input type="checkbox" name="rememberme" id="remember_me">
					<label class="remember_me" for="remember_me">记住我的登录状态</label>
				</li>
				<li>
					<a href="javascript:void(0);">忘记密码？</a>
				</li>
				</ul>
  			</form>
  			<div class="zu-index-link-apply-x2 r5px clear">
				<a class="zu-index-link-apply r5px" href="register.jsp">
					<span class="r5px zu-index-link-apply-x1">申请注册</span>
				</a>
			</div>
  		</div>
  	</div>
   
  </body>
</html>
