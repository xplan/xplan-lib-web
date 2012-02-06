package com.xplan.apps.aplan.service.impl;


import java.util.List;

import com.xplan.apps.aplan.beans.User;
import com.xplan.apps.aplan.dao.UserDAO;
import com.xplan.apps.aplan.service.UserService;

public abstract class UserServiceImpl implements UserService {

	private UserDAO userDao;

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	public void delete(User user) {
		this.userDao.removeUser(user);

	}

	public List<User> findAll() {

		return this.userDao.findAllUsers();
	}

	public User findById(Integer id) {
		return this.userDao.findUserById(id);
	}

	public void save(User user) {
		this.userDao.saveUser(user);
	}

	public void update(User user) {
		this.userDao.updateUser(user);
	}

	

}
