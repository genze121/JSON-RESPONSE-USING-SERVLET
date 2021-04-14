package com.JSON.DAO;

import java.util.Arrays;
import java.util.List;

import com.JSON.Bean.UserBean;

public class UserDAOImpl implements UserDAO {

	public List<UserBean> getAllUsers() {

		return Arrays.asList(new UserBean(1001, "Cristiano Ronaldo", "Portugal", "Male"),
				new UserBean(1002, "Luka Modric", "Croatia", "Male"),
				new UserBean(1003, "Smriti Mandhana", "Mumbai", "Female"),
				new UserBean(1004, "AB D", "South Africa", "Male"));
	}

}
