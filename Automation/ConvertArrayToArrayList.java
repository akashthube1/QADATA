package com.array_arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		
		String[] array = {"Akash","Omkar","Rushikesh","Akash"};
		for(String s : array)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		List<String> lst = new ArrayList(Arrays.asList(array));
        lst.add("Rahul");
        System.out.println(lst);
	}
}
