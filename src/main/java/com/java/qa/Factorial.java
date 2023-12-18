package com.java.qa;

public class Factorial 
{
	// Factorial value of a number 15

	public static void main(String[] args)
	{
		 int num=15;
		 long factorial=1;
		 for(int i=1;i<=num;i++)
		 {
			 factorial=factorial*i;
		 }
		 System.out.println("Factorial of a number is :"+factorial);

	}

}
