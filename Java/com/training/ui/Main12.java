package com.training.ui;

import java.util.LinkedList;
import java.util.List;

public class Main12 {

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

		boolean result1 = ilist.stream().anyMatch(i -> i >= 400);

		System.out.println(result1);

		boolean result2 = ilist.stream().allMatch(i -> i > 5);
		System.out.println(result2);

		boolean result3 = ilist.stream().noneMatch(i -> i == 0);
		System.out.println(result3);

	}

}
