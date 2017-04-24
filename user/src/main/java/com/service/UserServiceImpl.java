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
		// ��ȡ��ҳ��
		Page<User> page = new Page<User>();
		user.setPage(page);
		// ��ѯ��¼����
		int count = userDao.count(user);
		// ��ѯ�û��б�
		List<User> users = userDao.select(user);

		page.setTotalRecord(count);
		page.setResults(users);
		return page;
	}

}
