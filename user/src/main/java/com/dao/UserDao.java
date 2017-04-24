package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.User;

@Repository("userDao")
public interface UserDao {

	/**
	 * 分页查询用户
	 * @param user
	 * @return
	 */
	List<User> select(User user);
	
	/**
	 * 查询列表个数
	 * @param user
	 * @return
	 */
	int count(User user);
	
}
