package com.uca;

import java.util.Collection;
import java.util.ArrayList;

public class Start{
	
	//Start class
	public static void main(String[] args){
		RomanNumber numberFinal = new RomanNumber();
		
		if(args.length > 0){
			try {
				numberFinal.setValue(Integer.parseInt(args[0]));
				System.out.println("C'est un chiffre !");
			} catch(Exception e){
				numberFinal.setRoman(args[0]);
				System.out.println("C'est une chaine de caracteres !");
			}
			
			System.out.println(numberFinal.getValue());
			System.out.println(numberFinal.getRoman());
			return;
		}
		
		//TODO
		RomanNumber number = new RomanNumber(4);
		number.defineWhatElse();
		System.out.println("bonjour");
		try {
			System.out.println(RomanConverter.getRomanFromNumber(4));			
		} catch(Exception e) {
			System.out.println("Erreur ! " + e.toString());
		}
		
		Collection<RomanNumber> strings = new ArrayList<>();
		strings.add(new RomanNumber(4));
		strings.add(new RomanNumber(5));
		
		for(RomanNumber val : strings){
			 System.out.println(val.getValue());
		}
		
		RomanNumber number2 = new RomanNumber(4);
		System.out.println(number2.getRoman());
		
		
		/*for(int i=0; i<10; i++){
			System.out.println(i);
		} */
		
		System.out.println("aurevoir");
		
//		System.out.println("Valeur : " + number.getValue());
	}
	
}