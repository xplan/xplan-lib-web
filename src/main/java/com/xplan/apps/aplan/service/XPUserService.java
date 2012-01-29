package com.xplan.apps.aplan.service;  

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xplan.apps.aplan.dao.XPUserDao;
import com.xplan.apps.aplan.entity.XPUser;
/**
 * 
 *    
 * XPUserService   
 * 用户操作相关的service
 * Chivalrous   
 * Chivalrous   
 * 2011-12-23 下午5:12:52   
 *  参考以下方式自行写自己的service
 * @version 1.0.0   
 *
 */
//Spring Bean的标识.
@Repository
//默认将类中的所有函数纳入事务管理.
@Transactional
public class XPUserService {
	@Autowired
	private XPUserDao xpUserDao;
	/**
	 * 
	 * getAll(得到全部的用户)   
	 * (这里描述这个方法适用条件 – 可选)   
	 * @return    
	 *List<XPUser>   
	 * @exception    
	 * @since  1.0.0
	 */
	public List<XPUser> getAll(){
		return xpUserDao.getAll();
	}
	
}
