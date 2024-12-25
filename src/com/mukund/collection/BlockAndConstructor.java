package com.mukund.collection;

import javax.annotation.processing.SupportedAnnotationTypes;
@SuppressWarnings("unused")

public class BlockAndConstructor {

	static{
		System.out.println("static block executed");
	   }
	
	{
		System.out.println("Instance block executed");
	}
	
	public BlockAndConstructor() {
		
		System.out.println("Constructor executed");
	}

	public static void main(String[] args) {

		System.out.println("Main method executed");
		
		BlockAndConstructor block=new BlockAndConstructor();
		
	}
}
