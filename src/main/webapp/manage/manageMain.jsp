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
	
	<script type="text/javascript">
	Ext.onReady(function(){
		var viewport = new Ext.Viewport({
			
			layout: 'border',
			items: [{
					region:'north',
					html:'north',
					height:50
				},{
					region:'west',
					title:'west',
					width:200,
					collapsible:true,
					split:true,
					minSize:80,
					maxSize:200,
					margins:'0 0 0 5',
					layout: {
						type:'accordion',
						tileCollapse:true,
						activeOnTop:false,
						animate:true
					},
					items: [{
						contentEl:'west',
						title:'Navigation',
						boder:false,
						iconCls:'nav'
					},{
						title:'Setting',
						html:'123466',
						border:false,
						iconCls:'settings'
					},{
						title:'Setting',
						html:'123466',
						border:false,
						iconCls:'settings'
					},{
						title:'用户管理',
						html:'123466',
						border:false,
						iconCls:'settings'
					}]
				}, {
					region:'center',
					html:'center'
				}
			]
			
		});
	});
	
	</script>
</head>
<body>
	<div id="north"></div>
	<div id="west" ></div>
    <div id="center" ></div>
</body>
</html>