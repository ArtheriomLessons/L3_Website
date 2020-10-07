package com.uca;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;

public class Start{
	
	//Start class
	public static void main(String[] args){
		RomanNumber numberFinal = new RomanNumber();
		
		if(args.length > 0){
			try {
				numberFinal.setValue(Integer.parseInt(args[0]));
				System.out.println("C'est un entier !");
			} catch(Exception e){
				numberFinal.setRoman(args[0]);
				System.out.println("C'est une chaine de caracteres");
			}
			System.out.println(args[0]);
		}
		
		System.out.println(numberFinal.getValue());
		System.out.println(numberFinal.getRoman());
		
		
		RomanNumber number = new RomanNumber(4);
		
		
		for(int i=0; i<10; i++){
		//	System.out.println(i);
		}
		
		Collection<String> myStrings = new ArrayList<>();
		myStrings.add("str1");
		myStrings.add("str2");
		
		for(String key : myStrings){
		//	System.out.println(key);
		}
		
		int a = 90;
		
		
	}
	
}