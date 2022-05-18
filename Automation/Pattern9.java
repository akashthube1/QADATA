class Pattern9
{
  public static void main(String args[])
  {
	 int num = 1; 
     for (int i = 1;i<=5; i++)
	 {
	    for(int j = 1;j<=5;j++)
		{
		   System.out.print(num+" ");
		   num = num+5;
		}
		System.out.println();
	 }
  }
}
/*
1 6 11 16 21
26 31 36 41 46
51 56 61 66 71
76 81 86 91 96
101 106 111 116 121
*/