package com.java.qa;

public class Strings {

	public static void main(String[] args) {
		
		String str="Hello World";
		String str1="hello world";
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.indexOf("o"));
		System.out.println(str.charAt(3));
		System.out.println(str.compareTo(str1));
		System.out.println(str.compareToIgnoreCase(str1));
		System.out.println(str.concat(str1));
		System.out.println(str.contains("world"));
		System.out.println(str.equals(str1));
		System.out.println(str.lastIndexOf('o'));
		String str2=" ";
		System.out.println(str2.isBlank());
		System.out.println(str2.isEmpty());
		System.out.println(str.repeat(3));
		System.out.println(str.replace('l', 'u'));
		String s4="     Hello World    ";
		System.out.println(s4);
		System.out.println(s4.strip());
		System.out.println(s4.stripTrailing());
		System.out.println(s4.stripLeading());
		System.out.println(str.substring(6, 11));
		System.out.println(str.equalsIgnoreCase(str1));
		String[] splitString =str.split(" ");
		for(int n=0;n<splitString.length;n++)
		{
			System.out.println(splitString[n]);

		}
		
	
		
		
		
		
		
		
		

	}

}
