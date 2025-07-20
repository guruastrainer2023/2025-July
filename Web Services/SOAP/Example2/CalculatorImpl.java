package com.training.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class CalculatorImpl implements Calculator {

	@Override
	@WebMethod(operationName = "adding")
	public double add(@WebParam(name = "num1") double a, @WebParam(name = "num2")double b) {
		System.out.println("Calculator Service ADD executing with 2 parameters "+ a+ " and "+b);
		return a+b;
	}

	@Override
	@WebMethod(operationName = "subtracting")
	public double subtract(@WebParam(name = "num1") double a, @WebParam(name = "num2")double b) {
		System.out.println("Calculator Service SUBTRACT executing with 2 parameters "+ a+ " and "+b);
		return a-b;
	}

	@Override
	@WebMethod(operationName = "multiplying")
	public double multiply(@WebParam(name = "num1") double a, @WebParam(name = "num2")double b) {
		System.out.println("Calculator Service MULTIPLY executing with 2 parameters "+ a+ " and "+b);
		return a*b;
	}

	@Override
	@WebMethod(operationName = "dividing")
	public double divide(@WebParam(name = "num1") double a, @WebParam(name = "num2")double b) {
		System.out.println("Calculator Service DIVIDE executing with 2 parameters "+ a+ " and "+b);
		return a/b;
	}

}
