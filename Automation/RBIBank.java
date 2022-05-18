package com.oops_concept;
public class RBIBank {

	int loan,yr;
	float ir;
	
	public float homeLoan(int l,float r,int y)
	{
		float totalamt = l+(l * r * y )/100;
		return totalamt;
	}
	
    public static void main(String args[])
    {
    	RBIBank rbi = new RBIBank();
    	float total = rbi.homeLoan(100000,8.0f,5);
    	System.out.println("Amount to RBI bank with interest is : "+total);
    }
}
