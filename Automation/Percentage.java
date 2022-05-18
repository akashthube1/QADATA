package com.ass5;
import java.util.*;
public class Percentage {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the marks of biology");
		int bio = sc.nextInt();
		System.out.println("enter the marks of physics");
		int phy = sc.nextInt();
		System.out.println("enter the marks of mathematics");
		int math = sc.nextInt();
		System.out.println("enter the marks of science");
		int sci = sc.nextInt();
		System.out.println("enter the marks of english");
		int eng = sc.nextInt();
		
		if ((bio >= 0 && bio <= 100) && 
			 (phy >= 0 && phy <= 100) && 
			   (math >= 0 && math <= 100) &&
			       (sci >= 0 && sci <= 100) && 
			           (eng >= 0 && eng <= 100))
		{
			double total = bio + phy + math + sci + eng;
			
			double per = total / 500 * 100;
			System.out.println("Percentage of the student is = "+per);
			
			if (per >= 80)
			{
				System.out.println("Excellent");
			}
			else if (per < 80 && per >= 60) 
			{
				System.out.println("First class");
			}
			else if (per < 60  && per >= 50) 
			{
				System.out.println("Second class");
			}
			else if (per < 50 && per >= 40) 
			{
				System.out.println("Pass class");
			}
			else 
			{
				System.out.println("Fail");
			}
		}
		else
		{
			System.out.println("Invalid Marks");
		}
		sc.close();
	}
	

}
