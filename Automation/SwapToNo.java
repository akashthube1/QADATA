package com.ass5;
import java.util.*;
public class SwapToNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter 1st value");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd value");
		int num2 = sc.nextInt();
		
		num2 = num1+num2;
		num1 = num2-num1;
		num2 = num2-num1; 
		
	    System.out.println("After swap value is num1 : "+num1+ " num2 :  "+num2);
	    sc.close();
	}

}
