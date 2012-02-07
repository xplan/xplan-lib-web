package com.xplan.apps.aplan.service.impl;

import java.io.InputStream;
import java.util.List;

import com.xplan.apps.aplan.beans.User;
import com.xplan.apps.aplan.dao.UserDAO;
import com.xplan.apps.aplan.service.UserService;

/*
 * 服务层的实现方法，调用DAO层的方法实现。
 * */

public class UserServiceImpl implements UserService {

	private UserDAO userDao;
	
	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	
	@Override
	public void delete(User user) {
		this.userDao.removeUser(user);

	}
	
	@Override
	public List<User> findAll() {
		return this.userDao.findAllUsers();
	}

	@Override
	public void save(User user) {
		this.userDao.saveUser(user);

	}

	@Override
	public User findById(Integer id) {
		return this.userDao.findUserById(id);
	}

	@Override
	public void update(User user) {
		this.userDao.updateUser(user);

	}


}
