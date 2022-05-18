package com.oops_concept;
import java.util.Scanner;
class Employee extends Member
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter name of employee");
		String name = sc.next();
		System.out.println("Enter salary");
	    double sal = sc.nextDouble();
	    Employee e = new Employee();
	    e.printSalary(sal);
	}
}
