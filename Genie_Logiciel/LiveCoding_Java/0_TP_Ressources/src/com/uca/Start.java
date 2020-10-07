package com.uca;

public class Start{
	
	//Start class
	public static void main(String[] args){
		System.out.println("--- Start with value 4");
		RomanNumber number = new RomanNumber(4);
		System.out.println(number.getRoman());
		System.out.println(number.getValue());

		System.out.println("--- Continue with value 5");		
		number.setValue(5);
		System.out.println(number.getRoman());
		System.out.println(number.getValue());
	}
	
}