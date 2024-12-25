package com.mukund.collection;

public class FinalVariable {

	final int Num;
	public FinalVariable() {
		Num=20;
	}
	public void changX() {
	//	Num=20;
	}
	public static void main(String[] args) {

		var obj=new FinalVariable();
		int Number = obj.Num;
		System.out.println(Number);
		int Integer=20;
		char String='i';
		System.out.println("result:"+Integer+"and:"+String);
	}

}

