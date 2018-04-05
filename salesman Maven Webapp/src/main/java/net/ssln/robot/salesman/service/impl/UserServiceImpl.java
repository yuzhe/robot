package net.ssln.robot.salesman.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import net.ssln.robot.salesman.dao.UserDAO;
import net.ssln.robot.salesman.model.User;
import net.ssln.robot.salesman.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.insertUser(user);
	}
}
