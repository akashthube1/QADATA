package com.twodarray;

public class Uppercase {

	public static void main(String[] args) {
		

		String str = "india is my country";
		String names[] = str.split("\\s");
		String capital=" ";
		
		for (String name:names)
		{
			String firstLetter = name.substring(0,1);
			String remLetter = name.substring(1);
			capital+= firstLetter.toUpperCase()+remLetter+" ";
		}
		System.out.println(capital);
		//String output = str.substring(0,1).toUpperCase() + str.substring(1);
		//System.out.println(output);
	}

}
