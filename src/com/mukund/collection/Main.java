package com.mukund.collection;

public class Main {

	int num=200;
	public void m(int num) {
		this.num=num*20;
		
	}
	public void printNum() {
		System.out.println(num);
	}
	
	public static void main(String[] args) {

		Main m=new Main();
		m.m(2);
		m.printNum();
		System.out.println(m.num);
	}

}
