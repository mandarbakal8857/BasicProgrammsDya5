package com.Assignment.day5;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("It is Even No..");
		}else
		{
			System.out.println("It is Odd No..");
		}

	}

}
