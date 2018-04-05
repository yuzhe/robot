package net.ssln.robot.salesman.dao;

import net.ssln.robot.salesman.model.User;

public interface UserDAO {
	/**
	 * 添加新用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
}
