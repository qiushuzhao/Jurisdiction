package com.service;

import com.common.Page;
import com.entity.User;

public interface UserService {

	/**
	 * ��ҳ��ѯ�û�
	 * 
	 * @param user
	 * @return
	 */
	Page<User> select(User user);

	/**
	 * ��ѯ�б����
	 * 
	 * @param user
	 * @return
	 */
	int count(User user);
	
}
