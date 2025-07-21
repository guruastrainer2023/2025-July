package com.training.model;

public class Circle implements Shape{
	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setSize(int size) {
		this.setRadius(size);
		
	}

	public double getArea() {
		return 3.14*this.radius*this.radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
