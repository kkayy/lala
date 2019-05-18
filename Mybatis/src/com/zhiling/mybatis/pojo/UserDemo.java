package com.zhiling.mybatis.pojo;
/**
 * 包装user实体类的类
 * @author Administrator
 *
 */
public class UserDemo {
private User user;

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

@Override
public String toString() {
	return "UserDemo [user=" + user + "]";
}

}
