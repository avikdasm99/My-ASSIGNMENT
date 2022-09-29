// Write a java program to find the and even integers of an array.
package a1;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		int c1=0;
		System.out.print(" Length of array = ");
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        
        for(int i=0; i<a.length; i++){
        	System.out.print("Enter Element"+(i+1)+"= ");
        	a[i] = s.nextInt();
            }
        for(int i=0; i<a.length; i++){
        	if(a[i]%2==0) {
        		c1++;
        		System.out.println(a[i]+" is even number");
        	}
        	else {
        		System.out.println(a[i]+" is odd number");	
        	}	
        }
        System.out.println("Number of even integer = "+c1);
    	System.out.println("Number of odd integer = "+(a.length-c1));
	}
}
