package com.loopsassingnment4;

public class CountEvenNoBet1To10 {

	public static void main(String[] args) {
		int count = 0;
		int i = 1;
		while(i<=10)
		{
			if(i%2 == 0)
			{
				count++;
			}
			i++;
		}
		System.out.println("Total even number between 1 to 10"+count);

	}

}
