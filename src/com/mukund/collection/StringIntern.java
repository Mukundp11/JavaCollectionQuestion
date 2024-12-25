package com.mukund.collection;

public class StringIntern {

	public static void main(String[] args) {

		String greeting1="hello";
		String greeting2=new String("hello").intern();
		System.out.println(greeting1==greeting2);
		
		String str="hello";
		boolean result=str instanceof String;
		System.out.println(result);
		
	}

}
