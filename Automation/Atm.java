package com.logical;
import java.util.Scanner;

public class Atm {
	
	public void cashCounter(int amt)
	{
		int rup2000 = 0,rup500 = 0,rup200 = 0,rup100 = 0,rup50 = 0;
		
		if (amt % 50 == 0)
		{
			while(amt >= 2000)
			{
				rup2000 = amt / 2000;
				amt = amt % 2000;
				System.out.println("Total 2000 notes : "+rup2000);
				break;
			}
			while(amt >= 500)
			{
				rup500 = amt / 500;
				amt = amt % 500;
				System.out.println("Total 500 notes : "+rup500);
				break;
			}
			while(amt >= 200)
			{
				rup200 = amt / 200;
				amt = amt % 200;
				System.out.println("Total 200 notes : "+rup200);
				break;
			}
			while(amt >= 100)
			{
				rup100 = amt / 100;
				amt = amt % 100;
				System.out.println("Total 100 notes : "+rup100);
				break;
			}
			while(amt >= 50)
			{
				rup50 = amt / 50;
				amt = amt % 50;
				System.out.println("Total 50 notes : "+rup50);
				break;
			}
		}
		else
		{
			System.out.println("Please enter amount in multiple of 50.Rs");
		}
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ammount : ");
		int amt = sc.nextInt();
		
		Atm obj = new Atm();
		obj.cashCounter(amt);
   
	}

}
