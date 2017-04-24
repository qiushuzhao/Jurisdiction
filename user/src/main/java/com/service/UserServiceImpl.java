package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.common.Page;
import com.dao.UserDao;
import com.entity.User;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public int count(User user) {
		return userDao.count(user);
	}

	@Override
	public Page<User> select(User user) {
		// 获取分页类
		Page<User> page = new Page<User>();
		user.setPage(page);
		// 查询记录条数
		int count = userDao.count(user);
		// 查询用户列表
		List<User> users = userDao.select(user);

		page.setTotalRecord(count);
		page.setResults(users);
		return page;
	}

}
