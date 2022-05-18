package com.oops_concept;
import java.util.*;
public class Member {

	public void printSalary(double sal)
	{
		System.out.println("Total salary is : "+sal);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter mobile number");
	    long num = sc.nextLong();
	    System.out.println("Enter address");
	    String add = sc.next();
	    System.out.println("Enter salary");
	    double sal = sc.nextDouble();
	    
	    Member m = new Member();
	    m.printSalary(sal);
	}
}
