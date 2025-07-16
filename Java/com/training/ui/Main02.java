package com.training.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Main02 {

	public static void main(String[] args) {
		
		List<Integer> ilist=new LinkedList<>();
		
		ilist.add(Integer.valueOf(120));
		ilist.add(Integer.valueOf(10));
		ilist.add(Integer.valueOf(150));
		ilist.add(Integer.valueOf(75));
		ilist.add(Integer.valueOf(80));
		
		ilist
			.stream()
			.sorted()
			.filter((i)->i>=100)
			.forEach((i)-> System.out.println(i));
		
		
		List<String> cities=new LinkedList<>();
		cities.add("Pune");
		cities.add("Patna");
		cities.add("Kolkatta");
		cities.add("Cochin");
		
		//sort the cities
		//print the cities
		
		cities
			.stream()
			.sorted()
			.filter((c)->c.length()>=6)
			.forEach((c)->System.out.println(c));
	}

}
