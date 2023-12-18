package com.java.qa;

public class Pyramid {
	
	/* Print the pattern as below
	              *
	              **
	              ***
	              ****
	              *****
	              ******
	              *******
	              ********
	              *********
	              **********  */

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
