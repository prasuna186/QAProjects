package com.java.qa;

public class PrimeNumbers {
	
	//Printing prime numbers from 50 to 100

	public static void main(String[] args) {
		for(int i=50;i<100;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==0)
				System.out.println(i);
		}

	}

}
