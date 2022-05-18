import java.util.Scanner;
class Addition
{
   public static void PrintName(String name)
   {
     System.out.println("Name is : "+name);
   }
    
   public static int Add(int a,int b)
   {
	 return a+b;
   }
   
    public static double Add(double a,double b)
   {
	 return a+b;
   }

   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the name :");
	 String name = sc.next();
	 PrintName(name);
	 
	 System.out.println("Addition of int variable : "+Add(20,5));
	 System.out.println("Addition of double variable : "+Add(30.0,50.0));
   }
}