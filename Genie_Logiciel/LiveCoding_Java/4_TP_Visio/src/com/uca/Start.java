package com.uca;

public class Start{
	
	//Start class
	public static void main(String[] args){
		RomanNumber numberA = new RomanNumber();
		
		if(args.length >0){
			try {
				numberA.setValue(Integer.parseInt(args[0]));
			} catch(Exception e) {
				//This is a string !
				numberA.setRoman(args[0]);
			}
		}
		
		System.out.println(numberA.getRoman());
		System.out.println(numberA.getValue());
			
	}
	
}