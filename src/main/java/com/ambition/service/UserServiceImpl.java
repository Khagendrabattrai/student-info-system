package com.ambition.service;

import com.ambition.dao.UserDao;
import com.ambition.dao.UserDaoImpl;
import com.ambition.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public UserServiceImpl() {
		userDao= new UserDaoImpl();
		
		
	}
	

	@Override
	public void saveStudentInfo(User user) {
		userDao.saveStudentInfo(user);

	}

}
