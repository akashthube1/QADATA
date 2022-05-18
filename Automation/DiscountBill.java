package com.switchcase;
import java.util.*;
public class DiscountBill {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many quantity want");
		int quantity = sc.nextInt();
		
		System.out.println("Enter the price");
		int price = sc.nextInt();
		
		int totalbill = (quantity * price);
		if (totalbill > 5000)
		{
			int discountprice = (10 * totalbill)/100;
			System.out.println("You got a "+discountprice+ " discount");
			System.out.println("Discounted Bill is = "+(totalbill - discountprice));
		}
		else
		{
			System.out.println("You dont have any discount");
		}

		//using ternary
		
		int discountprice;
		int finalbill = totalbill > 5000 ? totalbill -(discountprice = (10 * totalbill))/100 : totalbill;
		System.out.println("Bill is = "+finalbill+" Rs");
	}

}
