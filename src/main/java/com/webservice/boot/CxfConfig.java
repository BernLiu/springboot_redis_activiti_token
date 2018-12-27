package com.webservice.boot;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfConfig {

	@Autowired
	private Bus bus;
	
	@Autowired
	private WebServiceTest webServiceTest;
	
	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, webServiceTest);
		endpoint.publish("/WebServiceTest");
		return endpoint;
	}
}
