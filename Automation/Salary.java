package com.loopassingment4pdf;
import java.util.*;
public class Salary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double basicsal , da, gross,hra;
		System.out.println("Enter salary");
	    basicsal = sc.nextDouble();
		
		if(basicsal <= 10000)
		{
			da = basicsal * 0.8;
			hra = basicsal * 0.2;
		}
		else if(basicsal <= 10000)
		{
			da = basicsal * 0.9;
			hra = basicsal * 0.25;
		}
		else
		{
			da = basicsal * 0.95;
			hra = basicsal * 0.3;
		}
		
       gross = basicsal + da + hra;
       System.out.println("The gross salary = "+gross);
	}

}
