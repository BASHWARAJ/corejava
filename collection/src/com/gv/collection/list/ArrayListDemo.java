package com.gv.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> intArrayList= new ArrayList<>();
		intArrayList.add(1);
		intArrayList.add(2);
		intArrayList.add(3);
		intArrayList.add(4);
		intArrayList.add(5);
		System.out.println(intArrayList);
		
		List<String> stringList=new ArrayList<>();
		stringList.add("abc");
		stringList.add("abc");
		stringList.add("abc");
		stringList.add("abc");
		stringList.add("abc");
		System.out.println(stringList.toString());
		
		//traditional for loop 
		for(int i=0;i<stringList.size();i++) {
			//String element=stringList.get(i);
			System.out.println(stringList.get(i));
		
			
		}
		
		//advance for loop
		for(int num:intArrayList)
			System.out.println(num);
		
		//for each method
		stringList.forEach(e->System.out.println(e));
		stringList.forEach(System.out::println);
		
		//stream api
		stringList.stream().forEach(System.out::println);
		
		//iterator/cursor
		Iterator<Integer> intIterator= intArrayList.iterator();
		while(intIterator.hasNext()) {
			int number=intIterator.next();
			System.out.println(Integer.toBinaryString(number));
		}
		int number1=intArrayList.get(4);
		Integer removeElement=5;
		
		//by index and by object(element)

		intArrayList.remove(removeElement);
		System.out.println(intArrayList);
		
		intArrayList.set(2,10);
		System.out.println(intArrayList);
		
		//by index and element, by element
		intArrayList.add(2,10);
		System.out.println(intArrayList);
		
		intArrayList.addAll(Arrays.asList(10,20,30,40,50,60));
		System.out.println(intArrayList);
		
		int[] intArray= {1,2,3,4,5};
		printArray(intArray);
		
		
		int index=intArrayList.indexOf(10);
		
		int LastIndex=intArrayList.lastIndexOf(10);
		
		System.out.println(index);
		System.out.println(LastIndex);
		
		List<Integer> subList=intArrayList.subList(5, 11);
		
		System.out.println(subList);
		
	}
	
	public static void printArray(int... arr) {
		System.out.println(Arrays.toString(arr));
	}

}
