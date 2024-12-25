package com.mukund.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoListadding {

	public static void main(String[] args) {
		
		List<Object> obj=new ArrayList<>(Arrays.asList("Ravi"));
		obj.add("M");
		
		obj.add(25);
		obj.add("manager");
		System.out.println(obj);
		String name="ravi";
		String s=new String("ravi");
		System.out.println(name==s);

	}

}
