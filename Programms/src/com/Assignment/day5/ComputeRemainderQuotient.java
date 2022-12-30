package com.Assignment.day5;

import java.util.Scanner;

public class ComputeRemainderQuotient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int n=sc.nextInt();
		
		int Remainder=n%2;
		int quotient=n/2;
		System.out.println("Remainder is:"+Remainder);
		System.out.println("Quotient is:"+quotient);
	}

}
