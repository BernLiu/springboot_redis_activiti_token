package com.webclient.boot;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Test;


public class WebServiceClientTest {

	@Test
	public void testSend() {
		
		//创建动态客户端
		JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
		Client client = dcf.createClient("http://localhost/services/WebServiceTest?wsdl");
	
	//	client.getOutFaultInterceptors().add(new ClientLoginInterceptor(USER_NAME,PASS_WORD))
		
		Object[] objects = new Object[0];
		try{
			// invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("sendMessage", "Bern");
            System.out.println("返回数据:" + objects[0]);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
