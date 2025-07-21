package com.training.model;

public class Rectangle implements Shape {

	int width, height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public void setSize(int size) {
		this.setWidth(size);
		this.setHeight(size*2);
		
	}

	public double getArea() {
		return this.width*this.height;
	}
	
	
}
