package com.assignment2;

public class Percentage {

	public static void main(String[] args) {
		
		int s1 = 87, s2 = 77, s3 = 78, s4 = 80, s5 = 87;;
		double total, avg, per;
		
		total = s1 + s2 + s3 + s4 + s5;
		System.out.println("Total marks obtain by the student =  "+total);
		
		avg = total/5;
		System.out.println("Average of the total subjects =  "+avg);
		
		per = total/500*100;
		System.out.println("Percentage of the student =  "+per);
		

	}

}
