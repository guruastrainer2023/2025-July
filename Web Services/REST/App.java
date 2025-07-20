package com.training.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * Hello world!
 */
public class App {
	
	public static void method1() {
		Client client = ClientBuilder.newClient();
		String baseUri = "http://localhost:8080/001-Rest-Example/api";
		WebTarget target = client.target(baseUri);
		target = target.path("demo/ping");
		String response=target.request(MediaType.TEXT_PLAIN).get(String.class);
		System.out.println(response);
	}
	
	public static void method2() {
		Client client = ClientBuilder.newClient();
		String baseUri = "http://localhost:8080/01-HelloREST/rest/helloapi";
		WebTarget target = client.target(baseUri);
		target = target.path("hello1");
		String response=target.request(MediaType.TEXT_HTML).get(String.class);
		System.out.println(response);
	}
	
	public static void method3() {
		Client client = ClientBuilder.newClient();
		String baseUri = "http://localhost:8080/01-HelloREST/rest/helloapi";
		WebTarget target = client.target(baseUri);
		target = target.path("hello2");
		String response=target.request(MediaType.TEXT_XML).get(String.class);
		System.out.println(response);
	}

    public static void main(String[] args) {
       method1();
    }
}
