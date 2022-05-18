package com.ass5;
import java.util.*;
public class PerimeterAreaRect {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the hight of rectangle");
		int hight = sc.nextInt();
		
		System.out.println("Enter the width of rectangle");
		int width = sc.nextInt();
		
		double per = 2*(hight*width);
		System.out.println("Perimeter of rectangle = " +per);
		
		double area = hight * width;
		System.out.println("Area of rectangle = " + area);

		char ch = 65;
		int ch1 = ch;
		System.out.println(ch);
		System.out.println(ch1);
		sc.close();
	}

}
