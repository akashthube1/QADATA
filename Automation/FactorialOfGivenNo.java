package com.assignment6;
import java.util.*;
public class FactorialOfGivenNo {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the any number");
     int num = sc.nextInt();
     
     int i = 1,fact = 1;
     while(i<=num)
     {
    	 fact = (fact * i);
    	 i++;
     }
     System.out.println("Factorial of given no = "+fact);
     
	}

}
