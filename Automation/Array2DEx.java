package com.twodarray;
public class Array2DEx {

	public static void printBoundry(int array[][],int m,int n)
	{
		for(int i = 0;i < m;i++)
		{
			for(int j = 0;i < n;j++)
			{
				if(i==0)
					System.out.print(array[i][j] +" ");
				else if(i == m-1)
					System.out.print(array[i][j] +" ");
				else if(j == 0)
					System.out.print(array[i][j] +" ");
				else if(j == n-1)
					System.out.print(array[i][j] +" ");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		
        int array[][] = {{1,1,1,1},{1,2,2,1},{1,2,2,1},{1,3,3,1}};
        printBoundry(array,4,4);
	}

}
