// Write a Java program to insert an element (specific position) into an array.

package a1;
import java.util.Arrays; 
public class InsertArray {
 
public static void main(String[] args) {

   int[] a = {25, 14, 56};
   
   int Index = 2;
   int newValue  = 5;

  System.out.println("Original Array : "+Arrays.toString(a));     
   
  for(int i=a.length-1; i > Index; i--){
    a[i] = a[i-1];
   }
   a[Index] = newValue;
   System.out.println("New Array: "+Arrays.toString(a));
    }
 }
