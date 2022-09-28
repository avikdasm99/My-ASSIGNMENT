// 1. Java Program to find average of an int Array.
package array;
import java.util.Scanner;  
public class AvgArray {

	public static void main(String[] args) {
        System.out.println(" Length of array = ");
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        
        int total = 0;

        for(int i=0; i<arr.length; i++){
        	System.out.print("Enter Element"+(i+1)+"= ");
        	arr[i] = s.nextInt();
        }
    
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }    
        int average = total / arr.length;
        
        System.out.println("the average is : " + average);
    }
}