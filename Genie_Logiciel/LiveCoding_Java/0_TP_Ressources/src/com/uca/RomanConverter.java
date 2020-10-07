package com.uca;

public class RomanConverter{
	
	public static String getRomanFromNumber(int number) throws IllegalArgumentException{
		if(number <= 0){
			throw new IllegalArgumentException("Number could not be equal or inferior to 0 !");
		}
		if(number > 3999){
			throw new IllegalArgumentException("Cannot handle such a big number !");
		}
		
		//Converter....
		switch(number){
			case 1 :
				return "I";
			case 2 : 
				return "II";
			case 3 : 
				return "III";
			case 4 :
				return "IV";
			case 5 : 
				return "V";
			case 6 : 
				return "VI";
			default:
				return "????????";
		}
	}
	
	
	public static int getNumberFromRoman(String roman){
		//Do things.
		return 0;
	}
	

}