package com.xplan.apps.aplan.beans;
/*
 * 做一个用户注册页面，用户需要填写用户名、密码、确认密码
 * */

public class User {
	private Integer id;
	private String username;
	private String password;
	private String repassword;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
	
}