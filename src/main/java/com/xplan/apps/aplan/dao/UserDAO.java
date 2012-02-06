package com.xplan.apps.aplan.dao;
import java.util.List;

/*
 * DAO层，定义user实现的接口。
 * */
import com.xplan.apps.aplan.beans.User;

public interface UserDAO {
	
	public void saveUser(User user);

	public void removeUser(User user);

	public User findUserById(Integer id);

	public List<User> findAllUsers();

	public void updateUser(User user);
}