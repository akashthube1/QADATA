package com.string;

public class DigitFromString {

	public static void main(String[] args) {
		
		String s = "123Java987String";
		String s1 = "";
		String s2 = "";
		for (int i = 0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if (ch>='0' && ch<='9')
			{
				s1 = s1 + ch;
			}
			else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				s2 = s2 + ch;
			}
		}
		System.out.println(s1);
		System.out.println(s2);

	}

}
