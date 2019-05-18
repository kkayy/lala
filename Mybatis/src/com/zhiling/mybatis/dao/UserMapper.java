package com.zhiling.mybatis.dao;

import com.zhiling.mybatis.pojo.User;
import com.zhiling.mybatis.pojo.UserDemo;

public interface UserMapper {
	User queryByIdAndPwd(UserDemo userdemo);
}
