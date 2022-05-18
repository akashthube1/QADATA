package com.oops_concept;

public class AbstractMethodExtend extends AbstractClass {
	
	@Override
	public void demo1()
	{	
		System.out.println("Abstract method demo1 of abstract class implemention");
	}
	
	@Override
	public void demo2() 
	{
		System.out.println("Abstract method demo2 of abstract class implemention");	
	}
	
	public static void main(String[] args) {
		
		AbstractClass obj = new AbstractMethodExtend();
		obj.demo1();
		obj.demo2();
		obj.demo3();
		/*AbstractClass ob = new AbstractClass() {

			@Override
			public void demo1() {
				// TODO Auto-generated method stub
				
			}
			@Override
	        public void demo2() {
		       // TODO Auto-generated method stub
		
	        }
			
		};*/
	}

}
