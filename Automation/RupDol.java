package com.ass5;
import java.util.*;
public class RupDol {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the value of indian rupees");
		int indrup = sc.nextInt();
		
		double dol = (indrup / 75);
		System.out.println("Total uds $ = "+dol);
		sc.close();
	}

}
