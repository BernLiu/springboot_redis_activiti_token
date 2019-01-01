package com.activiti.boot.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activiti.boot.bean.UserEntity;
import com.activiti.boot.dao.sys.UserRepository;
import com.activiti.boot.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserEntity login(String username, String password) {
		UserEntity ueEntity = new UserEntity();
		ueEntity.setUsername(username);
		ueEntity.setPassword(password);
		return userRepository.userLogin(ueEntity);
	}

	@Override
	public UserEntity findUserById(Integer id) {

		return userRepository.findOne(id);
	}
}
