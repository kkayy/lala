package com.zhiling.mybatis.service.impl;

import com.zhiling.mybatis.dao.UserMapper;
import com.zhiling.mybatis.pojo.User;
import com.zhiling.mybatis.pojo.UserDemo;
import com.zhiling.mybatis.service.UserService;
import com.zhiling.mybatis.util.OpenSessionInViewUtils;

public class UserServiceImpl implements UserService{
	UserMapper um;
	@Override
	public User queryByIdAndPwd(UserDemo userdemo) {
		um=OpenSessionInViewUtils.get().getMapper(com.zhiling.mybatis.dao.UserMapper.class);
		return um.queryByIdAndPwd(userdemo);
		// TODO Auto-generated method stub
	}

}
