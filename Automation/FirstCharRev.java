package com.string;
public class FirstCharRev {

	public static void main(String[] args) {
		String s = "Java is very easy language";
		String s1[] = s.split(" ");
		String s2="";
		for(String str:s1)
		{	
			int n = str.length()-1;
			for(int j = n;j>=0;j--) 
			{
				s2=s2+str.charAt(j);
			}
		}
		System.out.println(s2);
	}

}

