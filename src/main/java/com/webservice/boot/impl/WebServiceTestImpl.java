package com.webservice.boot.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.webservice.boot.WebServiceTest;

@Component
@WebService(serviceName="WebServiceTest",targetNamespace="boot.webservice.com",endpointInterface = "com.webservice.boot.WebServiceTest")
public class WebServiceTestImpl implements WebServiceTest {

	@Override
	public String sendMessage(String username) {
		
		return "hello"+username;
	}

}
