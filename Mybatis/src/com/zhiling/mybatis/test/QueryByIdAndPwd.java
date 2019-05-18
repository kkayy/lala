package com.zhiling.mybatis.test;

import com.zhiling.mybatis.pojo.User;
import com.zhiling.mybatis.pojo.UserDemo;
import com.zhiling.mybatis.service.UserService;
import com.zhiling.mybatis.service.impl.UserServiceImpl;

public class QueryByIdAndPwd {

	public static void main(String[] args) {
		UserDemo ud = new UserDemo();
		User user = new User();
		user.setId(2);
		user.setPwd("123");
		ud.setUser(user);
		UserService us =new UserServiceImpl();
		user = us.queryByIdAndPwd(ud);
		System.out.println("===========================");
		System.out.println(user);
	}

}
