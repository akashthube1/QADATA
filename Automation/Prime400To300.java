package com.loopassingment4pdf;
import java.util.*;
public class Prime400To300 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int high = 400, low = 300;
		while(high > low)
		{
			boolean flag = false;
			
			for(int i = 2; i >= high/2; --i )
			{
				if(high % i == 0)
				{
					flag = true;
					break;
				}
			}
			if(!flag && high != 0 && high != 1)
			{
				System.out.println(high+" ");
				--high;
			}
		}

	}

}
