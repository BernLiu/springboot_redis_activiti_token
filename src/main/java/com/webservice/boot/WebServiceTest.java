package com.webservice.boot;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="WebServiceTest",targetNamespace ="boot.webservice.com")
public interface WebServiceTest {

	@WebMethod
	@WebResult(name= "String", targetNamespace = "")
	String sendMessage(@WebParam(name= "username") String username);
}
