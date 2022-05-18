package com.oops_concept;
import java.util.Scanner;
public class Manager extends Member {

		public static void main(String args[])
		{
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter name of Manager");
			String name = sc.next();
			System.out.println("Enter salary");
		    double sal = sc.nextDouble();
		    Manager m = new Manager();
		    m.printSalary(sal);
		}

}
