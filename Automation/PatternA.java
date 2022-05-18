class PatternA
{
  public static void main(String args[])
  { 
     for (int i = 1;i<=5; i++)
	 {
	    for(int j = 5;j>i;j--)
		{
		   System.out.print(" ");
		}
		 for(int k = 0;k<=i;k++)
		{ 
		  if (i+k==6 || i+k==7 || i+k==8 || i+k == 9 || i+k==11) 
		   System.out.print("*");
		}
		System.out.println();
	 }
  }
}