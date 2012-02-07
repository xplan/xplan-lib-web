package com.xplan.apps.aplan.service;  

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xplan.apps.aplan.dao.XpManageUserDao;
import com.xplan.apps.aplan.entity.XpManageUser;

@Repository
@Transactional
public class XpManageUserService {
	@Autowired
	private XpManageUserDao xpManageUserDao;
	public List<XpManageUser> getAll(){
		return xpManageUserDao.getAll();
	}
	/**
	 * 
	 * saveUser(save)   
	 * (这里描述这个方法适用条件 – 可选)   
	 * @param xpManageUser    
	 *void   
	 * @exception    
	 * @since  1.0.0
	 */
	public void saveUser(XpManageUser xpManageUser){
		xpManageUserDao.save(xpManageUser);
	}
}
