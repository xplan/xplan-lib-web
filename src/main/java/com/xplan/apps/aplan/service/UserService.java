package com.xplan.apps.aplan.service;
import java.io.InputStream;
import java.util.List;

import com.xplan.apps.aplan.beans.User;

/**
 * 
 * 定义服务层增、删、查、改的接口
 *
 */

public interface UserService {
	
	public List<User> findAll();
	
	public void save(User user);

	public void delete(User user);

	public User findById(Integer id);

	public void update(User user);
	
	

}