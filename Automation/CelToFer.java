package com.assignment2;
import java.util.*;
public class CelToFer {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float celcius,fer;
		
		System.out.println("Enter temp in celcius");
		celcius = sc.nextFloat();
	
        fer = (celcius * 9/5) + 32;
        System.out.println(celcius+ " in fahrenhit = "+fer);
	}

}
