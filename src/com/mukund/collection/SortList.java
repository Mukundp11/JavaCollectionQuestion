package com.mukund.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {


		List<Object> obj=new ArrayList<>(Arrays.asList("Virat","cricketer",22));
		System.out.println("before sorting:"+obj);
		
		// provide custom comparator
		Collections.sort(obj,new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return o1.toString().compareTo(o2.toString());
			}
		});
		
		System.out.println("after sorting:"+obj);
		
		List<String> name=Arrays.asList("Virat","Sachin","Rohit");
		Collections.sort(name);
		System.out.println(name);
		
		
	}

}
