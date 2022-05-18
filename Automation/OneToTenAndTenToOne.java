package com.forloop;

public class OneToTenAndTenToOne {
	public void StartEnd()
	{
		for(int i = 1,j=10;i<=10 && j>=1;i++,j--)
		{
			System.out.print(i+" ");
		    System.out.println(j);
		}
	}

	public static void main(String[] args) {
		
		OneToTenAndTenToOne obj = new OneToTenAndTenToOne();
		obj.StartEnd();

	}

}
