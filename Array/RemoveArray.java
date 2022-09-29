// Write a Java program to remove a specific element from an array.

package a1;

import java.util.Arrays; 
public class RemoveArray {
 
public static void main(String[] args) {
   int[] a = {25, 14, 56, 15, 36};
   
   System.out.println("Original Array : "+Arrays.toString(a));     
   int removeIndex = 1;
   for(int i = removeIndex; i < a.length -1; i++){
       a[i] = a[i + 1];
      }
   System.out.println("After removing the "+(removeIndex+1)+" element: "+Arrays.toString(a));
 }
 }