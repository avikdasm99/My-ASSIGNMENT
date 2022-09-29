//Write a Java program to find the maximum and minimum value of an array
package a1;
import java.util.Scanner;
import java.util.Arrays; 
public class MaxMin {
	
      public static void main(String[] args) {
    	  System.out.print(" Length of array = ");
    	    Scanner s= new Scanner(System.in);
    	    int n = s.nextInt();
    	    int[] a = new int[n];
    	    
    	    for(int i=0; i<a.length; i++){
    	    	System.out.print("Enter Element"+(i+1)+"= ");
    	    	a[i] = s.nextInt();
    	        }  
    	    int max = a[0];  
    	    int min = a[0];  
            for (int i = 0; i < a.length; i++) {  
                
               if(a[i] > max)  
                   max = a[i];
               if(a[i] < min)  
                   min = a[i];
            }  
            System.out.println("Largest element = " + max);  
            System.out.println("Smallest element= " + min);  
    }
}