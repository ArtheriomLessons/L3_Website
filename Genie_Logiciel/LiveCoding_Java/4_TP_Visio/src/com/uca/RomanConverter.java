package com.uca;

public class RomanConverter{
	
	public static String getRomanFromNumber(int a) throws IllegalArgumentException{
		if(a<=0){
			throw new IllegalArgumentException("a cannot be equal or inferior to 0 !");
		}
		if(a>3999){
			throw new IllegalArgumentException("a is too big !");
		}
		
		switch(a){
			case 1:
				return "I";
			case 2:
				return "II";
			case 3:
				return "III";
			case 4:
				return "IV";
			case 5:
				return "V";
			case 6:
				return "VI";
			default:
				return "???";
		}
	}
	
	public static int getNumberFromRoman(String a){
		switch(a){
			case "I":
				return 1;
			case "II":
				return 2;
			case "III":
				return 3;
			case "IV":
				return 4;
			case "V":
				return 5;
			case "VI":
				return 6;
			default:
				return 0;
		}
	}
}