package com.array;
public class CharArray {

	public static void main(String[] args) {
		
		char array []= {'a','b','c','d','z'} ;
		int i;
		for(i = 0;i<array.length;i++)
		{
			if(array[i] >= 'a' && array[i] <= 'x')
			{
				array[i] =(char)((char)array[i]+2);
			}
			else if(array[i] =='z')
			{
				array[i] = 'b';
			}
		}
		for(i = 0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}

}
