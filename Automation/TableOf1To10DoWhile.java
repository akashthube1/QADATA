package com.loopassingment4pdf;
import java.util.*;
public class TableOf1To10DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		while(num <= 10)
		{
			for(int i = 1; i <= 10; i++)
			{
				System.out.println(num+ "*" +i+ "=" +(num * i));
			}
			System.out.println("");
			num++;	
		}

	}

}
