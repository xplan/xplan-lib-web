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
}
