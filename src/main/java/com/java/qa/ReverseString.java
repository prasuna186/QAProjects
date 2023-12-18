package com.java.qa;

public class ReverseString {
	
	// Printing the string in reverse order

	public static void main(String[] args) {
		String str="PRASUNA";
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse string is :"+rev);
	}

}
