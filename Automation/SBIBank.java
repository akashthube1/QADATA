package com.oops_concept;
import java.util.Scanner;
public class SBIBank extends RBIBank {

	public void carLoan(int amt,int y)
	{
		float totalamt = (amt*12.0f*y)/100;
		System.out.println("Total ammount to pay SBI of car loan is : "+totalamt);	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		SBIBank sbi = new SBIBank();
		
		System.out.println("Enter the loan ammount");
		int amt = sc.nextInt();
		System.out.println("Enter the interest rate");
		float rt = sc.nextInt();
		System.out.println("How many year you want");
		int yr = sc.nextInt();
		
		sbi.carLoan(amt,yr);
		float totalamt = sbi.homeLoan(amt,rt,yr);
		System.out.println("Total ammount to pay SBI of home loan is : "+totalamt);

	}

}
