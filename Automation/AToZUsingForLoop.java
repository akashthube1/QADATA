package com.forloop;

public class AToZUsingForLoop {
	
	public void aTozCapital(char start,char end)
	{
		for(char i = start;i<=end;i++)
	     {
	    	 System.out.print(i+" ");
	     }
	}

	public static void main(String[] args) {

		AToZUsingForLoop obj = new AToZUsingForLoop();
		obj.aTozCapital('C','Z');
	}

}
