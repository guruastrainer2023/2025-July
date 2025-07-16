package com.training.ui;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;

public class Main01 {
	public static void main(String[] args) {
		
		List<Integer> ilist=new LinkedList<>();
		
		ilist.add(Integer.valueOf(200));
		ilist.add(Integer.valueOf(10));
		ilist.add(Integer.valueOf(150));
		ilist.add(Integer.valueOf(180));
		ilist.add(Integer.valueOf(140));
		
	
		
		ilist.forEach((i)->System.out.println(i));
		
		List<String> cities=new LinkedList<>();
		cities.add("Pune");
		cities.add("Patna");
		cities.add("Kolkatta");
		cities.add("Cochin");
		
		
		cities.forEach((s)->System.out.println(s.toUpperCase()));
		
		List<Circle> allCircles=CollectionFactory.getCircleList();
		
		allCircles.forEach(c->System.out.println(c.getRadius()) );
		allCircles.forEach(c->System.out.println(c));
		
	}
}
