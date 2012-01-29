package com.xplan.apps.aplan.wyh.action;  

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.xplan.apps.aplan.beans.LoginInfoBeans;
import com.xplan.apps.aplan.service.XPUserService;

@SuppressWarnings("unused")
public class APlanLoginActions extends ActionSupport {
	private static final Logger log = Logger.getLogger(APlanLoginActions.class);
	private static final long serialVersionUID = -5561253722122205414L;

	@Autowired
	private XPUserService xpUserService;//注入XPUserService对象
	
	private LoginInfoBeans loginUser;//domain mode 
	
	public LoginInfoBeans getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(LoginInfoBeans loginUser) {
		this.loginUser = loginUser;
	}

	
	public void login() throws Exception {
		
		log.info(this.loginUser.getUserName());
		log.info(this.loginUser.getPassword());
		 
	}
	
	
	
}
