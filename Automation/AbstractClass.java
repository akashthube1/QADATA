package com.oops_concept;

abstract public class AbstractClass {

	public AbstractClass() 
	{
		System.out.println("Constructor of the abstract class");
	}
	
	abstract public void demo1();
	abstract public void demo2();
	
	public static void demo3()
	{
		System.out.println("Its from non abstract method of abstract class");
	}
}
