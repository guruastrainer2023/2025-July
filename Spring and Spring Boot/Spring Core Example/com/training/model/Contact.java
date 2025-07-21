package com.training.model;

public class Contact {
	String emailid;
	String phone;
	
	public Contact(String emailid, String phone) {
		super();
		this.emailid = emailid;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Contact [emailid=" + emailid + ", phone=" + phone + "]";
	}
	
	
}
