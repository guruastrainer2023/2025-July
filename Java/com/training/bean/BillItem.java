package com.training.bean;

public class BillItem implements Comparable<BillItem>{

	private String itemName;
	private int quantity;
	private double price;
	
	public BillItem(String itemName, int quantity, double price) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public int compareTo(BillItem o) {
		//BillItem other=(BillItem) o;
		int r=this.itemName.compareTo(o.itemName);
		return r;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getItemValue() {
		return this.quantity*this.price;
	}

	

	@Override
	public String toString() {
		return "\nBillItem [itemName=" + itemName + ", quantity=" + quantity + ", price=" + price + ", getItemValue()="
				+ getItemValue() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BillItem))
			return false;
		BillItem other = (BillItem) obj;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		return true;
	}
	
	
	
	
}
