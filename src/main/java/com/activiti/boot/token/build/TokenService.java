package com.activiti.boot.token.build;

import org.springframework.stereotype.Component;

import com.activiti.boot.bean.UserEntity;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

@Component
public class TokenService {

	public String getToken(UserEntity user) {
		String token ="";
		token = JWT.create().withAudience(String.valueOf(user.getId()))
				    .sign(Algorithm.HMAC256(user.getPassword()));
		return token;
	}
}
