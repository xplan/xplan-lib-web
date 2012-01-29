package com.xplan.apps.aplan.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTxTestCase;

import com.xplan.apps.aplan.dao.XPUserDao;
import com.xplan.apps.aplan.entity.XPUser;

@ContextConfiguration(locations = { "/applicationContext-test.xml"})
public class XPUserDaoTest extends SpringTxTestCase {

	@Autowired
	private XPUserDao entityDao;
	@Test
	public void testAll(){
		List<XPUser> list = entityDao.find("FROM XPUser WHERE id=1");
		 assertNotNull(list);
		
	}
	
}
