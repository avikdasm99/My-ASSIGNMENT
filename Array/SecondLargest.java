// Write a Java program to find the second largest element in an array.

package a1;
import java.util.Arrays;
public class SecondLargest {

	public static void main(String[] args) {
		int[] a = {1,2,4,6,3,7,9};
		
	System.out.println("Original  array : "+Arrays.toString(a)); 
	
	Arrays.sort(a);
	
	System.out.println("Sort array : "+Arrays.toString(a));

	System.out.println("Second largest value: " + a[a.length-2]);
	
	}
}
