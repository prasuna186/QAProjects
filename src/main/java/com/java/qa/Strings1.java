package com.java.qa;

public class Strings1 {

	public static void main(String[] args) 
	{
		
		String str="wwweeeerrtyyyyyuuui";
		int arr[] = new int[str.length()];
		char chr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(chr[i]==chr[j])
					arr[i]++;
				    chr[j]=0;
			}
		}
		for(int i=0;i<arr.length;i++) 
		{
			if(chr[i]!=' '&&chr[i]!='0')
				System.out.println(arr[i]+"_"+chr[i]);
		}
				
		}
}
		

