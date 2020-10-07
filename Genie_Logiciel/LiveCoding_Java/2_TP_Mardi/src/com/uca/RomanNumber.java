package com.uca;

public class RomanNumber{
	
	private String roman;
	
	private int value;
	
	public RomanNumber(){
		//Ignored
	}
	
	public RomanNumber(int value){
		this.value = value;
		this.roman = RomanConverter.getRomanFromNumber(value);
	}
	
	public RomanNumber(String roman){
		this.roman = roman;
		this.value = RomanConverter.getNumberFromRoman(roman);
	}
	
	/*public RomanNumber(int value, String roman){
		this.value = value;
		this.roman = roman;
	}*/
	
	//Commentaire
	
	public String getRoman(){
		return this.roman;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public void setRoman(String roman){
		this.roman = roman;
		this.value = RomanConverter.getNumberFromRoman(roman);
	}
	
	public void setValue(int value){
		this.value = value;
		this.roman = RomanConverter.getRomanFromNumber(value);
	}
	
	
	// value & roman field
	// getter/setter + constructor

	public int defineWhatElse(){
		//....
		//Méthode classique sur un objet, vous mettez ce que vous voulez :)
		return 0;
	}

}