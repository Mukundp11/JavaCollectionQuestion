package com.mukund.collection;

import java.util.LinkedList;

public class LinkedListRemove {

	public static void main(String[] args) {

		LinkedList<String> name=new LinkedList<>();
		name.add("Ravi");
		name.add("manager");
		name.add("virat");
		System.out.println(name);
		name.remove(0);
		name.remove("manager");
		System.out.println("after removal:"+name);
		
		for(int i=0;i++<5;i++) {
			System.out.println("hello");
			i=i++;
			
		}
	}

}
