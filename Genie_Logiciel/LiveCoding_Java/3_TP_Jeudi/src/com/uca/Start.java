package com.uca;

import java.util.Collection;
import java.util.ArrayList;

public class Start{
	
	//Start class
	public static void main(String[] args){
		RomanNumber finalNumber = new RomanNumber();
		
		if(args.length > 0){
			try {
				finalNumber.setValue(Integer.parseInt(args[0]));
				System.out.println("C'est un chiffre !");
			} catch(Exception e){
				finalNumber.setRoman(args[0]);
				System.out.println("C'est une chaîne");
			}
			
			System.out.println(finalNumber.getValue());
			System.out.println(finalNumber.getRoman());
			
//			System.out.println(args[0]);
		}
		
		RomanNumber number = new RomanNumber(4);
		System.out.println(number.getRoman());
		
		number.setRoman("V");
		System.out.println(number.getValue());
		
		Collection<RomanNumber> numbers = new ArrayList<>();
		numbers.add(new RomanNumber(1, "I"));
		numbers.add(new RomanNumber(4, "IV"));
		numbers.add(new RomanNumber(5, "V"));
		
		for(RomanNumber n : numbers){
			System.out.println(n.getValue() + " - " + n.getRoman());
		}
		
/*		for(int i=0; i<=10; i++){
			System.out.println(i);
		}*/
		
		/*int i=10;
		while(i>=1){
			System.out.println("i="+i);
			i--;
		}*/
		
		/*System.out.println("Hello world !");
		RomanNumber number = new RomanNumber(4);
		System.out.println(number.getValue());
		System.out.println(number.getRoman());
		
		number.setRoman("IV");
		System.out.println(number.getRoman());
		number.addOne();
		System.out.println(number.getRoman());*/
		//TODO
		
		System.out.println(RomanConverter.getRomanFromNumber(2));
		
		try {
			System.out.println(RomanConverter.getRomanFromNumber(-4));			
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		System.out.println(RomanConverter.getRomanFromNumber(6));
	}
	
}