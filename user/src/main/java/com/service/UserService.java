package com.service;

import com.common.Page;
import com.entity.User;

public interface UserService {

	/**
	 * 分页查询用户
	 * 
	 * @param user
	 * @return
	 */
	Page<User> select(User user);

	/**
	 * 查询列表个数
	 * 
	 * @param user
	 * @return
	 */
	int count(User user);
	
}
