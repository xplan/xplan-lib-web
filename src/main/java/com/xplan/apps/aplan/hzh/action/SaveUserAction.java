package com.xplan.apps.aplan.hzh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xplan.apps.aplan.beans.User;
import com.xplan.apps.aplan.service.UserService;

public class SaveUserAction extends ActionSupport {
	
	private User user;
	private UserService userService;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
	@Override
	public String execute() throws Exception {
		this.userService.save(this.user);  //保存用户信息到数据库
		return SUCCESS;
	}

}
