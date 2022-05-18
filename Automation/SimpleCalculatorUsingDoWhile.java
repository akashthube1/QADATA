package com.loopsassingnment4;
import java.util.*;
import java.util.Scanner;

public class SimpleCalculatorUsingDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    do {
			
			System.out.println("Enter 1st number");
			double num1 = sc.nextInt();
			System.out.println("Enter 2nd number");
			double num2 = sc.nextInt();
			
			System.out.println("Chose Operator: +,-,*,/");
			char ch = sc.next().charAt(0);

			switch(ch)
			{
			  case '+':
				  double result = num1 + num2;
				  System.out.println("Addition is = "+result);
				  break;
				  
			  case '-':
				  result = num1 - num2;
				  System.out.println("Substraction is = "+result);
				  break;
				  
			  case '*':
				  result = num1 * num2;
				  System.out.println("Multiplication is = "+result);
				  break;
				  
			  case '/':
				  result = num1 / num2;
				  System.out.println("Division is = "+result);
				  break;
				  
		      default:
		    	  System.out.println("Invalid");
			} 
			System.out.println("If you want to continue press y");
			char s = sc.next().charAt(0);
	    }while(true);

	}

}
