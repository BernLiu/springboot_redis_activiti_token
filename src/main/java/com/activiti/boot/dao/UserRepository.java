package com.activiti.boot.dao;

import com.activiti.boot.bean.UserEntity;

public interface UserRepository {
	
	UserEntity userLogin(UserEntity userEntity);
	
	UserEntity findOne(Integer id);
	
	UserEntity selectByName(String username);

}
