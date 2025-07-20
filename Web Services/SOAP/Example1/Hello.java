package com.training.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public class Hello {
	
	@WebMethod
	public String f1(String name) {
		System.out.println("Web Service Received a request with "+name);
		return "Hello " + name.toUpperCase();
	}

}
