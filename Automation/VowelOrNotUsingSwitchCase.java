package com.loopsassingnment4;
import java.util.*;
public class VowelOrNotUsingSwitchCase {

	public static void main(String[] args) {
	
      Scanner sc = new Scanner (System.in);
      do {
    	  System.out.println("Enter any alphabate");
    	  char ch = sc.next().charAt(0);
    	  
    	  switch(ch)
    	  {
    	  case 'a':
    		  System.out.println("Its vowel");
    		  break;
    	  case 'e':
    		  System.out.println("Its vowel");
    		  break;
    	  case 'i':
    		  System.out.println("Its vowel");
    		  break;
    	  case 'o':
    		  System.out.println("Its vowel");
    		  break;
    	  case 'u':
    		  System.out.println("Its vowel");
    		  break;
    	  
    	  case 'A':
    		  System.out.println("Its vowel");
    		  break;
    	  case 'E':
    		  System.out.println("Its vowel");
    		  break;
    	  case 'I':
    		  System.out.println("Its vowel");
    		  break;
    	  case 'O':
    		  System.out.println("Its vowel");
    		  break;
    	  case 'U':
    		  System.out.println("Its vowel");
    		  break;
    	  
    	  default:
    		  System.out.println("Its consonent");
    		  break;
    	  }
           System.out.println("Do you want to continue press y");
           char s = sc.next().charAt(0);
      }while(true);
	}

}
