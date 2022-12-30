package com.Assignment.day5;


import java.util.Scanner;

public class HarmonicNo {

	public static void main(String[] args) 
	{
		double num=0,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			num=num+((float)1/i);
			result=num;
		}
		System.out.println("harmonic no is:"+result);

	}

}
