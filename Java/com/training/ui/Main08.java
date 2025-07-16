package com.training.ui;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

import com.training.bean.BillItem;
import com.training.bean.comparator.BillItemPriceComparator;

public class Main08 {

	public static void main(String[] args) {
		
		Set<BillItem> billItemSet = new TreeSet<>();

		billItemSet.add(new BillItem("Redmi", 10, 10000.00));
		billItemSet.add(new BillItem("Iphone", 12, 60000.00));
		billItemSet.add(new BillItem("OPPO", 8, 17000.00));
		billItemSet.add(new BillItem("DELL Laptop", 3, 58000.00));
		billItemSet.add(new BillItem("IBM", 2, 8000.00));
		
		billItemSet
			.stream()
			.mapToInt(bi->bi.getQuantity())
			.forEach((q)->System.out.println(q));
		
		System.out.println("--------------------------------");
		
		billItemSet
			.stream()
			.sorted(new BillItemPriceComparator())
			.forEach(bi->System.out.println(bi));
		
		
		
		//print in the ascending order of quantity
		
		
		
		
IntStream stream=IntStream.rangeClosed(1, 10);
		
		//stream=Arrays.stream(arr);
		stream.forEach((i)->System.out.println(i));
		
		//IntStream stream2=Arrays.stream(arr);
		//OptionalInt optionalInt =stream2.max();
		//if(optionalInt.isPresent())
		//	System.out.println(optionalInt.getAsInt());
		//else
		//	System.out.println("Source is Empty");
		
		
		//OptionalInt optionalInt=stream.min();
		//if(optionalInt.isPresent())
		///	System.out.println(optionalInt.getAsInt());
		//else
		//	System.out.println("Source Empty");
		
		//long cnt=stream.count();
		//System.out.println(cnt);
		//OptionalDouble optionalDouble=	stream.average();
		//if(optionalDouble.isPresent())
		//	System.out.println(optionalDouble.getAsDouble());
			
		//stream.distinct().forEach((i)->System.out.println(i));
		stream.filter((i)->i%2==0).distinct().forEach((i)->System.out.println(i));
		//int total=stream.filter((i)->i%2==0).distinct().sum();
		//System.out.println(total);
		
		//boolean result=stream.noneMatch((i)->i%2!=0);
		//System.out.println(result);
		
		//OptionalInt  optionalInt=stream.reduce((i,j)->i+j);
		//System.out.println(optionalInt.getAsInt());
		//List<Integer> list=stream.boxed().collect(Collectors.toList());
		//System.out.println(list);

	}

}
