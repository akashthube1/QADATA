package com.switchcase;
import java.util.*;
public class Picnic {

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Participent are there:");
		int participent = sc.nextInt();
		switch(participent )
		{
		case 30 :
		case 29 :
		case 28 :
		case 27 :
		case 26 :
		case 25 :
		case 24 :
		case 23 :
		case 22 :
		case 21 :
			   System.out.println("Minibus Booked");
		       break;
		case 20 :
		case 19 :
		case 18 :
		case 17 :
		case 16 :
		case 15 :
		case 14 :
		case 13 :
		case 12 :
			   System.out.println("Traveler Booked");
		       break;
		case 11 :
		case 10 :
			   System.out.println("Ertiga Booked");
		       break;
		case 9 :
		case 8 :
		case 7 :
		case 6 :
			   System.out.println("Sumo Booked");
		       break;
		case 5 :
		case 4 :
		case 3 :
			   System.out.println("Car Booked");
		       break;
		case 2 :
		case 1 :
			   System.out.println("MotorBike Booked");
		       break;
		default :
			   System.out.println("Picnic Cancelled");
		}
	}

}
