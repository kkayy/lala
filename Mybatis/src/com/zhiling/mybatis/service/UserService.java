package com.zhiling.mybatis.service;

import com.zhiling.mybatis.pojo.User;
import com.zhiling.mybatis.pojo.UserDemo;

public interface UserService {
	User queryByIdAndPwd(UserDemo userdemo);
}
