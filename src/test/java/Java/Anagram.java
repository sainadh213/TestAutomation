package Java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter 1st String");
		String s1 = sc.next();
		System.out.println("Enter 2nd string");
		String s2=sc.next();
	char[] a = s1.toCharArray();
	
	char temp,tempp;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println(a);
	char[] b = s2.toCharArray();
	
	
	for(int i=0;i<b.length;i++)
	{
		for(int j=i+1;j<b.length;j++)
		{
			if(b[i]>b[j])
			{
				tempp=b[i];
				b[i]=b[j];
				b[j]=tempp;
			}
		}
	}
			
	System.out.println(b);
		if(a.equals(b))
		{
			System.out.println("given string is Anagram");
		}
		else
		{
			System.out.println("given string is not a anagram");
		}

	}

}
