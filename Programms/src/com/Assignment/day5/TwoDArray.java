package com.Assignment.day5;

import java.util.Iterator;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) 
	{
		int i, j;
	      int[][] a = new int[3][3];
	      int[][] b = new int[3][3];
	      int[][] c = new int[3][3];
	      
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter 9 elements for first matrix: ");
	      for(i=0; i<3; i++)
	      {
	         for(j=0; j<3; j++)
	         {
	            a[i][j] = s.nextInt();
	         }
	      }
	      
	      System.out.print("Enter 9 elements for second matrix: ");
	      for(i=0; i<3; i++)
	      {
	         for(j=0; j<3; j++)
	         {
	            b[i][j] = s.nextInt();
	         }
	      }
	      
	      System.out.println(" 3X3 Matrix are:");
	      for ( i = 0; i <3; i++)
	      {
	    	  for ( j = 0; j < c.length; j++) 
	    	  {
	    		  System.out.print("  "+a[i][j]);
				
			}
	    	  System.out.print("\n");
			
		}
	      for(i=0; i<3; i++)
	      {
	         for(j=0; j<3; j++)
	         {
	            c[i][j] = a[i][j] + b[i][j];
	         }
	      }
	      
	      System.out.println("Addition is:-");
	      for(i=0; i<3; i++)
	      {
	         for(j=0; j<3; j++)
	         {
	            System.out.print(c[i][j]+ " ");
	         }
	         System.out.print("\n");
	      }	
	}
}
				
			
		
			
			
		



