package com.loopassingment4pdf;
import java.util.*;
public class First10Terms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth number");
		int n = sc.nextInt();
		for (int i = 10 ; i <= n; i += 10)
		{
		    System.out.println(i+ " ");
		}

	}

}
