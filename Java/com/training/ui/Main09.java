package com.training.ui;

import java.util.LinkedList;
import java.util.List;

public class Main09 {

	public static void main(String[] args) {
		List<Integer> ilist = new LinkedList<>();

		ilist.add(Integer.valueOf(200));
		ilist.add(Integer.valueOf(10));
		ilist.add(Integer.valueOf(150));
		ilist.add(Integer.valueOf(180));
		ilist.add(Integer.valueOf(140));
		ilist.add(Integer.valueOf(200));
		ilist.add(Integer.valueOf(750));
		ilist.add(Integer.valueOf(200));
		ilist.add(Integer.valueOf(330));
		ilist.add(Integer.valueOf(450));

		ilist.stream().limit(7).forEach((i) -> System.out.println(i));
		System.out.println("------------------------------");

		ilist.stream().distinct().forEach((i) -> System.out.println(i));

	}

}
