package com.uca;

public class RomanNumber{
	
	private String roman;
	private int value;
	
	public RomanNumber(){
		//Affectation etc.
	}
	
	public RomanNumber(int value){
		this.value = value;
		this.roman = RomanConverter.getRomanFromNumber(value);
	}
	
	public RomanNumber(String roman){
		this.roman = roman;
		this.value = RomanConverter.getNumberFromRoman(roman);
	}
	
	public int getValue(){
		return this.value;
	}
	
	public String getRoman(){
		return this.roman;
	}
	
	public void setValue(int value){
		this.value = value;
		this.roman = RomanConverter.getRomanFromNumber(value);
	}
	
	public void setRoman(String roman){
		this.roman = roman;
		this.value = RomanConverter.getNumberFromRoman(roman);
	}

}