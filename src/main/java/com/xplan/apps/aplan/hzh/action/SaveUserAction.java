package com.xplan.apps.aplan.hzh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.xplan.apps.aplan.beans.User;
import com.xplan.apps.aplan.entity.XpManageUser;
import com.xplan.apps.aplan.service.XpManageUserService;

public class SaveUserAction extends ActionSupport {
	
	private User user;
	private XpManageUserService xpManageUserService;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
 

	
	@Override
	public String execute() throws Exception {
		
		XpManageUser x = new XpManageUser();
		x.setXpManageUserName(user.getUsername());
		this.xpManageUserService.saveUser(x);
		return SUCCESS;
	}

}
