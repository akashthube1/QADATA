package com.object;
import java.util.Scanner;

public class AreaRectCir {
	Scanner sc = new Scanner(System.in);
	
//	public float areaCircle()
//	{
//	  System.out.println("Enter the value of redius");
//	  int r = sc.nextInt();
//	  float pi = 3.14f,area;
//      
//	  area = pi * r * r;
//	  return area;
//	}
	
	public float areaRect(int l,int w)
	{
	  float area;
	  area = l * w;
	  return area;
	}
	public int findMax(int a,int b)
	{
		if (a>b)
			return a;
		else
			return b;
	}

	public static void main(String[] args) {
	
		AreaRectCir obj = new AreaRectCir();
		//obj.areaCircle();
		//System.out.println("Area of circle is :"+obj.areaCircle());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of lenght");
		int l = sc.nextInt();
		System.out.println("Enter the value of width");
		int w = sc.nextInt();
		
		float ans = obj.areaRect(l,w);
		System.out.println("Area of rectangle :: "+ans);
		
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		
		int result = obj.findMax(a, b);
		System.out.println("Max number is : "+result);
	}

}
