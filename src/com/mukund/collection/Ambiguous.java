package com.mukund.collection;

public class Ambiguous {

	public void display(Integer i) {
		System.out.println("Integer");
	}
	public void display(int i) {
		System.out.println("int");
	}
	public static void main(String[] args) {

		var obj=new Ambiguous();
		obj.display(null);
		obj.display(55);
		
	}

}
