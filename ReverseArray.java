// 1. Write a Java Program to reverse the array contents.

package array;

import java.util.Scanner; 
public class ReverseArray {
	
    public static void main(String[] args) { 
    	Scanner s = new Scanner(System.in);
    	System.out.println("enter the length : ");
		int n = s.nextInt();
		
		int arr[] = new int[n];
		System.out.println("original array : ");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println(" after reversing : ");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}	
	}
}