package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.User;

@Repository("userDao")
public interface UserDao {

	/**
	 * ��ҳ��ѯ�û�
	 * @param user
	 * @return
	 */
	List<User> select(User user);
	
	/**
	 * ��ѯ�б����
	 * @param user
	 * @return
	 */
	int count(User user);
	
}
