package com.uca;

public class RomanConverter{
	
	public static String getRomanFromNumber(int value) throws IllegalArgumentException {
		if(value <= 0){
			throw new IllegalArgumentException("number could not be <= 0");
		}
		
		switch(value){
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
		//...
	}
	
	public static int getNumberFromRoman(String roman){
		//...
		switch(roman){
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
	
	//static (getRomanFromNumber(int) + getNumberFromRoman(roman))
	//Check + IAE / switch number on fRGM, return 0 on gNFR

}