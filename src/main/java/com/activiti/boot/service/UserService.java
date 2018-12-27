package com.activiti.boot.service;

import com.activiti.boot.bean.UserEntity;

public interface UserService {

	public UserEntity login(String username,String password);
	
	public UserEntity findUserById(Integer id);
}
