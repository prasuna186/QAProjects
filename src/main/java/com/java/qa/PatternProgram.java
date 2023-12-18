package com.java.qa;

public class PatternProgram {
	
	/* Print the pattern as below
	            *
	           ***
	          *****
	         *******
	        *********
	 */

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int s=1;s<=15-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
		

	

}
