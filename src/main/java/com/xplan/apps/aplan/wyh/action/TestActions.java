package com.xplan.apps.aplan.wyh.action;  

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.xplan.apps.aplan.entity.XPUser;
import com.xplan.apps.aplan.service.XPUserService;
  
public class TestActions extends ActionSupport{
	
	private static final long serialVersionUID = -3276360388017498228L;
	private static final Logger log =Logger.getLogger(TestActions.class);
	@Autowired
	private XPUserService  xPUserService; 
	
	public void test() throws Exception {
		List<XPUser> l =  xPUserService.getAll();
		for(XPUser o:l){
			log.info(o.getPassword());
		}
	}
	
	
}
