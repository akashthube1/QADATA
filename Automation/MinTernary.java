package com.switchcase;

public class MinTernary {

	public static void main(String[] args) {
		
		int a = 20,b = 76, c = 54;
		
		int min = a<b && a<c ? a : b<c && b<a ? b : c;
        System.out.println("Minimum number = "+min);
        
       
	}

}
