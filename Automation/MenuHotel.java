package com.switchcase;
import java.util.*;
public class MenuHotel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("_______Menu Card_______");
		System.out.println("1.\t Panjabi");
		System.out.println("2.\t Maharashtriyan");
		System.out.println("3.\t Rajshtani");
		System.out.println("4.\t South Indian");
		
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		  case 1:
		  {
				System.out.println("1.\t Shahi Paneer\t\t Rs.140");
				System.out.println("2.\t Mater Mushroom\t\t Rs.140");
				System.out.println("3.\t Rajma\t\t\t Rs.100");
				System.out.println("4.\t Roti\t\t\t Rs.20");
				
				System.out.println("Enter your choice");
				int ch1 = sc.nextInt();
				
				System.out.println("How many quantity you want");
				int qua = sc.nextInt();
				
				switch(ch1)
				{
				 case 1: System.out.println("Quantity :"+qua+" --> Total Bill = Rs."+(qua*140));
				         break;

				 case 2: System.out.println("Quantity :"+qua+" -->Total Bill = Rs."+(qua*140));
				         break;

				 case 3: System.out.println("Quantity :"+qua+" -->Total Bill = Rs."+(qua*100));
				         break;

				 case 4: System.out.println("Quantity :"+qua+" -->Total Bill = Rs."+(qua*20));
				         break;
				         
				 default :System.out.println("Enter correct choice");
				}
				break;
			 
		  }
		  case 2:
		  {

				System.out.println("1.\t Misal Pav\t\t Rs.80");
				System.out.println("2.\t Mataki Rassa\t\t Rs.180");
				System.out.println("3.\t Palak Paneer\t\t Rs.130");
				System.out.println("4.\t Chapati\t\t Rs.20");
				
				System.out.println("Enter your choice");
				int ch1 = sc.nextInt();
				
				System.out.println("How many quantity you want");
				int qua = sc.nextInt();
				
				switch(ch1)
				{
				 case 1: System.out.println("Quantity :"+qua+" --> Total Bill = Rs."+(qua*80));
				         break;

				 case 2: System.out.println("Quantity :"+qua+" -->Total Bill = Rs."+(qua*180));
				         break;

				 case 3: System.out.println("Quantity :"+qua+" -->Total Bill = Rs."+(qua*130));
				         break;

				 case 4: System.out.println("Quantity :"+qua+" -->Total Bill = Rs."+(qua*20));
				         break;
				         
				 default :System.out.println("Enter correct choice");
				}
				break;
		  }
		  case 3:
		  {

				System.out.println("1.\t Dalbati Churma\t\t Rs.180");
				System.out.println("2.\t Mawa Kachori\t\t Rs.60");
				System.out.println("3.\t Mohan Mas\t\tRs.120");
				System.out.println("4.\t Phulka\t\t Rs.25");
				
				System.out.println("Enter your choice");
				int ch1 = sc.nextInt();
				
				System.out.println("How many quantity you want");
				int qua = sc.nextInt();
				
				switch(ch1)
				{
				 case 1: System.out.println("Quantity :"+qua+" --> Total Bill = Rs."+(qua*180));
				         break;

				 case 2: System.out.println("Quantity :"+qua+" -->Total Bill = Rs."+(qua*60));
				         break;

				 case 3: System.out.println("Quantity :"+qua+" -->Total Bill = Rs."+(qua*120));
				         break;

				 case 4: System.out.println("Quantity :"+qua+" -->Total Bill = Rs."+(qua*25));
				         break;
				         
				 default :System.out.println("Enter correct choice");
				}
				break;
		  
		  }
		  case 4:
		  {

				System.out.println("1.\t Vada Samabar\t\t Rs.80");
				System.out.println("2.\t Idali Vada\t\t Rs.50");
				System.out.println("3.\t Masala Dosa\t\t Rs.40");
				System.out.println("4.\t Curd Rise\t\t Rs.60");
				
				System.out.println("Enter your choice");
				int ch1 = sc.nextInt();
				
				System.out.println("How many quantity you want");
				int qua = sc.nextInt();
				
				switch(ch1)
				{
				 case 1: System.out.println("Quantity :"+qua+" --> Total Bill = Rs."+(qua*80));
				         break;

				 case 2: System.out.println("Quantity :"+qua+" -->Total Bill = Rs."+(qua*50));
				         break;

				 case 3: System.out.println("Quantity :"+qua+" -->Total Bill = Rs."+(qua*40));
				         break;

				 case 4: System.out.println("Quantity :"+qua+" -->Total Bill = Rs."+(qua*60));
				         break;
				         
				 default :System.out.println("Enter correct choice");
				}			
		  }
		  default :
			  System.out.println("Enter correct choice");
		}
		
	}

}
