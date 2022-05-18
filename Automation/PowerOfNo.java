package com.loopassingment4pdf;
import java.util.*;
public class PowerOfNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter base");
		int base = sc.nextInt();

		System.out.println("Enter exponent");
		int expo = sc.nextInt();
		
		System.out.println("Power of given number is " +Math.pow(base, expo));
	}

}
