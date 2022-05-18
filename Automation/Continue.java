package com.forloop;

public class Continue {
	
	public void continueStatement()
	{
		int i = 0;
				while(i<10)
				{
					i++;
					if (i==2 || i==4 || i==6 || i==8 || i==10)
					continue;
					System.out.println(i);
				
				}
	}

	public static void main(String[] args) {
		
		Continue obj = new Continue();
		obj.continueStatement();
	}

}
