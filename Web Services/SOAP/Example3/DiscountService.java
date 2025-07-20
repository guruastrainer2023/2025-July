package com.training.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class DiscountService {
	
	@WebMethod(operationName = "getDiscount")
	public double calculateDiscount(@WebParam(name = "price")  double price,@WebParam(name = "category")String category) throws Exception {
		double discount=0.0;
		switch (category) {
		case "TV":
			discount=price*0.15;
			break;
		case "MOBILE":
			discount=price*0.10;
			break;
		case "LAPTOP":
			discount=price*0.05;
			break;

		default:
			throw new Exception("Invalid Category");
			
		}
		return discount;
	}

}
